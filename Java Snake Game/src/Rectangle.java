import java.awt.Color;
import java.awt.Graphics;

public class Rectangle {
	private int width, height, posX, posY;
	
			public Rectangle(int width, int height, int posX, int posY) {
		// TODO Auto-generated constructor stub
				this.posX=posX;
				this.posY=posY;
				this.width=width;
				this.height=height;
	}
		public int getPosX() {
			return posX;
		}
		public int getPosY() {
			return posY;
		}
		public int getWidth() {
			return width;
		}
		public int getHeight() {
			return height;
		}
		
}
