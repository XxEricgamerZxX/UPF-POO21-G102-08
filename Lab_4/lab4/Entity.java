package lab4;
import java.awt.*;


abstract public class Entity {
	protected Color lineColor;

	public Entity(Color initlineC ){
		lineColor=initlineC;
	}
	public Color getColor(){
		return lineColor;
	}
	public void setColor( Color c){
		this.lineColor= c;
	}
	
	abstract public void draw(Graphics g );
	abstract public void translate( Vector V );
	abstract public boolean isSelected(Point p);
}
