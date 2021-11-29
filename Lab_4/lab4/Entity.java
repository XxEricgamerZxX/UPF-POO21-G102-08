package lab4;
import java.awt.*;


abstract public class Entity {
	protected Color lineColor;

	public Entity( ){
	}
	public Color getColor(){
		return lineColor;
	}
	public void setColor( Color c){
		this.lineColor= c;
	}
	abstract public boolean isSelected(Point Punto);
	abstract public void draw(Graphics g );
	abstract public void translate( int dx, int dy );
	
}
