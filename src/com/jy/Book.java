package com.jy;

public class Book extends SKU {


    @Override
    public String toString()
    {
        if(getSku().equals("Java1001"))
        {
            return  "Title:Head First Java\n" +
                    "Author:Kathy Sierra and Bert Bates\n" +
                    "Description:Easy to read Java workbook\n" +
                    "Price:47.50";
        }
        else if(getSku().equals("Java1002"))
        {
            return  "Title:Thinking in Java\n" +
                    "Author:Bruce Eckel\n" +
                    "Description:Details about Java under the hood\n" +
                    "Price:20.00";
        }
        else if(getSku().equals("Orcl1003"))
        {
            return  "Title:OCP: Oracle Certified Professional Java SE\n" +
                    "Author:Jeanne Boyarsky\n" +
                    "Description:Everything you need to know in one place\n" +
                    "Price:45.00";
        }
        else if(getSku().equals("Python1004"))
        {
            return  "Title:Automate the Boring Stuff with Python\n" +
                    "Author:Al Sweigart\n" +
                    "Description:Fun with Python" +
                    "Price:10.50";
        }
        else if(getSku().equals("Zombie1005"))
        {
            return  "Title:The Maker's Guide to the Zombie Apocalypse\n" +
                    "Author:Simon Monk\n" +
                    "Description:Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi\n" +
                    "Price:16.50";
        }
        else if(getSku().equals("Rasp1006"))
        {
            return  "Title:Raspberry Pi Projects for the Evil Genius\n" +
                    "Author:Donald Norris\n" +
                    "Description:A dozen fiendishly fun projects for the Raspberry Pi!\n" +
                    "Price:14.75";
        }
        else
        {
            return "Incorrect SKU Number";
        }
    }
}
