package com.mycompany;

import sun.reflect.generics.tree.Tree;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        TreeItem mieszko1 = new TreeItem("Mieszko I");
        TreeItem bolek = new TreeItem("Boleslaw Chrobry");
        TreeItem sygryda = new TreeItem("Sygryda Stoorrada");

        TreeItem bezprym = new TreeItem("bezprym");
        TreeItem regelinda= new TreeItem("Regelinda");
        TreeItem mieszko2 = new TreeItem("Mieszko II");

        TreeItem kazik= new TreeItem("Kazimierz Odnowiciel");
        TreeItem gertruda = new TreeItem("Gertruda");



        mieszko1.addChild(bolek);
        mieszko1.addChild(sygryda);

        bolek.addChild(bezprym);
        bolek.addChild(regelinda);
        bolek.addChild(mieszko2);

        mieszko2.addChild(kazik);
        mieszko2.addChild(gertruda);

//        HashSet<TreeItem> mieszkoChildren = new HashSet<TreeItem>();
//        mieszkoChildren.add(bolek);
//        mieszkoChildren.add(sygryda);
//        mieszko1.setChildren(mieszkoChildren);
//
//        HashSet<TreeItem> bolekChildren = new HashSet<TreeItem>();
//        bolekChildren.add(bezprym);
//        bolekChildren.add(regelinda);
//        bolekChildren.add(mieszko2);
//        bolek.setChildren(bolekChildren);
//
//        HashSet<TreeItem> mieszko2Children = new HashSet<TreeItem>();
//        mieszko2Children.add(kazik);
//        mieszko2Children.add(gertruda);
//        sygryda.setChildren(mieszko2Children);


        /*TreeItem current = i1;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getChildren();
        }*/

        System.out.println();
        System.out.println();

        printTreeItem(mieszko1);

    }

    public static void printTreeItem (TreeItem item){
        System.out.println(item.getData());

        if (item.getChildren() != null) {
            Iterator iterator = item.getChildren().iterator();
            while (iterator.hasNext()) {
                printTreeItem((TreeItem) iterator.next());
            }
        }
    }

}
