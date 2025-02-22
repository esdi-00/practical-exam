package com.rocs.circle.application;

import com.rocs.circle.application.Dao.Circle.CircleDao;
import com.rocs.circle.application.Dao.Circle.Imp.CircleDaoImpl;
import com.rocs.circle.application.app.circle.CircleFacade;
import com.rocs.circle.application.app.circle.impl.CircleFacadeImpl;
import com.rocs.circle.application.model.circle.Circle;

public class CircleApplication {
    public static void main(String[] args) {
        CircleFacade circleFacade = new CircleFacadeImpl();
        Circle circle = new Circle();
        circle.setRad(4);
        System.out.println("Area: "+ circleFacade.getArea(circle));
        System.out.println("Circumference: "+circleFacade.getCircumference(circle));
    }
}
