package jrJava.imageManipulation;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import resources.DrawingBoard;


public class UsingBufferedImage {

	
	public static void main(String[] args) throws IOException{
	
		DrawingBoard board = new DrawingBoard(1200, 780);
		Graphics2D canvas = board.getCanvas();
		
		//Image image1 = new ImageIcon("jrJava/imageManipulation/darthVader.png").getImage();
		File file1 = new File("jrJava/imageManipulation/darthVader.png");
		BufferedImage image1 = ImageIO.read(file1);

		BufferedImage image2 = new BufferedImage(image1.getWidth(), image1.getHeight(), BufferedImage.TYPE_INT_ARGB);
		BufferedImage image3 = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
		
		int pixelData, j;
		
		for(int i=0;i<image2.getWidth()-1;i++){
			for(j=0;j<image2.getHeight()-1;j++){
				pixelData = image1.getRGB(i, j);
				image2.setRGB(image1.getWidth()-1-i, image1.getHeight()-1-j, pixelData);
				
			}
		
		}
		for(int i=0;i<image3.getWidth()-1;i++){
			for(j=0;j<image3.getHeight()-1;j++){
				pixelData = image1.getRGB(150+i, 50+j);
				image3.setRGB(i, j, pixelData);
				
			}
		
		}
		
		
		
		canvas.drawImage(image1, 100, 100, board);
		canvas.drawImage(image2, 500, 100, board);
		canvas.drawImage(image3, 900, 100, board);
		board.repaint();
		
		
		File file2 = new File("jrJava/imageManipulation/darthVader2.png");
		ImageIO.write(image2, "png", file2);
		File file3 = new File("jrJava/imageManipulation/darthVader3.png");
		ImageIO.write(image3, "png", file3);		
		
	}

}



















