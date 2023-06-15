

import javax.annotation.Resource;
import javax.inject.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;


public class circle {
	private point point;
	private point pointA;
	private int radius =10;
	
	
	public point getPoint() {
		return point;
	}
	@Inject
	@Qualifier("circleRelated")
	public void setPoint(point point) {
		this.point = point;
	}
	
	public point getPointA() {
		return pointA;
	}
	@Resource(name="pointC")
	public void setPointA(point pointA) {
		this.pointA = pointA;
	}

	public void draw() {
		System.out.println("Draw Circle of radius :- " +radius);
		System.out.println("Circle point is (" +point.getX() +"," + point.getY()+")");
		System.out.println("Circle point is (" +pointA.getX() +"," + pointA.getY()+")");
	}

	public int getRadius() {
		return radius;
	}

	
	 @Required 
	 public void setRadius(int radius) { 
		 this.radius = radius; 
		 }
	 
	
	

}


