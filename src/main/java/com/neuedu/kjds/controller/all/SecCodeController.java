package com.neuedu.kjds.controller.all;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;

@Controller
@RequestMapping("/code")
public class SecCodeController {

    @RequestMapping
        public void generate(HttpServletResponse response, HttpSession session){
            //完成验证码绘制到字节数组流内存缓冲区中
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            String code = drawImg(output);
            //要产生的验证码，写入到session保存，以便登录时做验证判断
            session.setAttribute("code", code);
        //最后把字节数组流内存缓冲区的验证码图像通过输出流返回给客户端
        try {
            ServletOutputStream out = response.getOutputStream();
            output.writeTo(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //绘制验证码图片的方法
    private String drawImg(ByteArrayOutputStream output){
        //循环4次，得到4个验证码字符串保存到code中
        String code = "";
        for(int i=0; i<4; i++){
            code += randomChar();
        }
        //设置定义验证码图片的宽高
        int width = 70;
        int height = 25;
        //使用内存图形图像类创建内存图形图像对象用于绘制验证码图
        BufferedImage bi = new BufferedImage(width,height,BufferedImage.TYPE_3BYTE_BGR);
        Font font = new Font("Times New Roman",Font.PLAIN,20);
        //获取图像的画布对象，用于绘制验证码
        Graphics2D g = bi.createGraphics();
        //定义好绘制的颜色和字体
        g.setFont(font);
        Color color = new Color(66,2,82);
        g.setColor(color);
        g.setBackground(new Color(226,226,240));
        //实现绘制验证码字符的位置及其参数计算
        g.clearRect(0, 0, width, height);
        FontRenderContext context = g.getFontRenderContext();
        Rectangle2D bounds = font.getStringBounds(code, context);
        double x = (width - bounds.getWidth()) / 2;
        double y = (height - bounds.getHeight()) / 2;
        double ascent = bounds.getY();
        double baseY = y - ascent;
        //绘制验证码字符到图形画布上
        g.drawString(code, (int)x, (int)baseY);
        g.dispose();
        //通过图像IO类将绘制好的验证码图形输出写入到字节数组流中
        try {
            ImageIO.write(bi, "jpg", output);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //返回生成的验证码；
        return code;
    }
    //生成随机的验证码字符并返回
    private char randomChar(){
        //初始化一个随机类，用于产生某个范围的随机整数
        Random r = new Random();
        //定义出可用于验证码的字符序列的字符串
        String s = "ABCDEFGHJKLMNPRSTUVWXYZ0123456789";
        //通过随机类产生出随机值，根据随机值取出字符序列中任一个字符作为验证码字符
        return s.charAt(r.nextInt(s.length()));
    }
}
