package com.codeup.adlister.controllers;
import javax.servlet.annotation.WebServlet;
import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ad")
public class IndividualAdServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //setting the url to use and we will need to figure out how to return only the ad that was chosen make method in dao to find ad by id
        //the id is being passed in as a url parameter called "id"
        int thisAdId = (int) request.getParameter("id");
        request.setAttribute("ad", DaoFactory.getAdsDao().individualAd(thisAdId));
    }

}
