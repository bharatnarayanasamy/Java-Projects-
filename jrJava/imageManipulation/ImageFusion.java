package jrJava.imageManipulation;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import resources.DrawingBoard;

public class ImageFusion {
public static void main(String[] args) throws IOException{
		
		DrawingBoard board = new DrawingBoard(1200, 780);
		Graphics2D canvas = board.getCanvas();
		
		File file1 = new File("jrJava/imageManipulation/transformer_red.png");
		BufferedImage image1 = ImageIO.read(file1);
		File file2 = new File("jrJava/imageManipulation/transformer_green.png");
		BufferedImage image2 = ImageIO.read(file2);

		BufferedImage image3 = new BufferedImage(image1.getWidth(), image1.getHeight(), BufferedImage.TYPE_INT_ARGB);

				
		int j;
		int pixelData1, a1, r1, b1, g1;
		int pixelData2, a2, r2, b2, g2;
		int pixelData3, a3, r3, b3, g3;

		
		int mask = 0xff;// 0x000000ff//255//0b11111111;
		double weight = 0.6;
		
		for(int i=0;i<image3.getWidth();i++){
			for(j=0;j<image3.getHeight();j++){
				
				pixelData1 = image1.getRGB(i, j);
				a1 = (pixelData1>>24) & mask;
				r1 = (pixelData1>>16) & mask;
				g1 = (pixelData1>>8) & mask;
				b1 = pixelData1 & mask;
				
				pixelData2 = image2.getRGB(i, j);
				a2 = (pixelData2>>24) & mask;
				r2 = (pixelData2>>16) & mask;
				g2 = (pixelData2>>8) & mask;
				b2 = pixelData2 & mask;
				
				weight = (double) i/image3.getWidth();
				
				a3 = (int) (weight*a1 + (1-weight)*a2);
				r3 = (int) (weight*r1 + (1-weight)*r2);
				g3 = (int) (weight*g1 + (1-weight)*g2);
				b3 = (int) (weight*b1 + (1-weight)*b2);
				pixelData3 = (a3<<24) | (r3<<16) | (g3<<8) | (b3);
				image3.setRGB(i, j, pixelData3);
			}
		
		}
		
		
		
		canvas.drawImage(image3, 50, 50, board);
		board.repaint();
		
		
		File file3 = new File("jrJava/imageManipulation/transformer_fused.png");
		ImageIO.write(image3, "png", file3);
		
	}
}
