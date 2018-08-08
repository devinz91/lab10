
package hw;

import java.util.*;
import org.jgrapht.Graph;
import org.jgrapht.alg.color.GreedyColoring;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;
import org.jgrapht.traverse.BreadthFirstIterator;
import org.jgrapht.traverse.ClosestFirstIterator;
import org.jgrapht.traverse.DepthFirstIterator;
import org.jgrapht.traverse.RandomWalkIterator;

public class Main {




  public static void main(final String[] args) {

    final String UT = CountryCodes.UT;
    final String ID = CountryCodes.ID;
    final String NV = CountryCodes.NV;
    final String CA = CountryCodes.CA;
    final String OR = CountryCodes.OR;
    final String AZ = CountryCodes.AZ;

    final Graph<String, DefaultEdge> myMap = new SimpleGraph<>(DefaultEdge.class);
    myMap.addVertex(NV);
    myMap.addVertex(UT);
    myMap.addVertex(AZ);
    myMap.addVertex(CA);
    myMap.addVertex(OR);
    myMap.addVertex(ID);

    myMap.addEdge(NV, UT);
    myMap.addEdge(NV, AZ);
    myMap.addEdge(NV, CA);
    myMap.addEdge(NV, OR);
    myMap.addEdge(NV, ID);
    myMap.addEdge(UT, AZ);
    myMap.addEdge(AZ, CA);
    myMap.addEdge(CA, OR);
    myMap.addEdge(OR, ID);
    myMap.addEdge(ID, UT);

    System.out.println(myMap);


    final Iterator<String> bf = new BreadthFirstIterator<>(myMap, NV);
    while (bf.hasNext()) {
      final String state = bf.next();
      System.out.println(state);
    }


    final Iterator<String> cf = new ClosestFirstIterator<>(myMap, NV);
    while (cf.hasNext()) {
      final String state = cf.next();
      System.out.println(state);
    }



    final Iterator<String> df = new DepthFirstIterator<>(myMap, NV);
    while (df.hasNext()) {
      final String state = df.next();
      System.out.println(state);
    }


    final Iterator<String> rw = new RandomWalkIterator<>(myMap, NV);
    while (rw.hasNext()) {
      final String state = rw.next();
      System.out.println(state);
    }


    GreedyColoring graph = new GreedyColoring(myMap);
    System.out.println(graph.getColoring());
  }
}






