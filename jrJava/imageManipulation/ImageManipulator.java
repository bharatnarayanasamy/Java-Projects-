package jrJava.imageManipulation;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import resources.DrawingBoard;

public class ImageManipulator {
	public static void main(String[] args) throws IOException{
		
		DrawingBoard board = new DrawingBoard(1200, 780);
		Graphics2D canvas = board.getCanvas();
		
		File file1 = new File("jrJava/imageManipulation/transformer_red.png");
		BufferedImage image1 = ImageIO.read(file1);

		BufferedImage image2 = new BufferedImage(image1.getWidth(), image1.getHeight(), BufferedImage.TYPE_INT_ARGB);

				
		int j;
		int pixelData1, a1, r1, b1, g1;
		int pixelData2, a2, r2, b2, g2;
		
		int mask = 0xff;// 0x000000ff//255//0b11111111;
		
		
		for(int i=0;i<image2.getWidth();i++){
			for(j=0;j<image2.getHeight();j++){
				
				pixelData1 = image1.getRGB(i, j);
				a1 = (pixelData1>>24) & mask;
				r1 = (pixelData1>>16) & mask;
				g1 = (pixelData1>>8) & mask;
				b1 = pixelData1 & mask;
				
				a2 = a1;
				r2 = g1;
				g2 = r1;
				b2 = b1;
				pixelData2 = (a2<<24) | (r2<<16) | (g2<<8) | (b2);
				image2.setRGB(i, j, pixelData2);
			}
		
		}
		
		
		
		canvas.drawImage(image1, 50, 50, board);
		canvas.drawImage(image2, 600, 50, board);
		board.repaint();
		
		
		File file2 = new File("jrJava/imageManipulation/transformer_green.png");
		ImageIO.write(image2, "png", file2);
		
	}
}



