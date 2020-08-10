/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
  public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
    if (node == null) {
      return null;
    }
    Map<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<>();
    Queue<UndirectedGraphNode> queue = new LinkedList<>();
    queue.add(node);
    map.put(node, new UndirectedGraphNode(node.label));
    while (!queue.isEmpty()) {
      UndirectedGraphNode removed = queue.remove();
      for (UndirectedGraphNode neighbor : removed.neighbors) {
        if (!map.containsKey(neighbor)) {
          map.put(neighbor, new UndirectedGraphNode(neighbor.label));
          queue.add(neighbor);
        }
        map.get(removed).neighbors.add(map.get(neighbor));
      }
    }
    return map.get(node);
  }
}
