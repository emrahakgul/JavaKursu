package Day37.InstanceModifiers.publicModifier.Other;

import Day37.InstanceModifiers.publicModifier.Same.SearchEngine;

public class Edge_Browser {
    public static void main(String[] args) {
        SearchEngine microsoft=new SearchEngine("explorer");
microsoft.name="Edge";
        System.out.println(microsoft);
    }
}
