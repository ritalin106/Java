public class StudentGroups {
	
	public static void main(String[] args) {
	
		int[] friendship = new int[16];
		
		for (int i = 0; i < friendship.length; i++) {
			friendship [i] = i;
		}
		
		for (int i = 0; i < friendship.length; i++) {
			int j = (int)(Math.random() * friendship.length);
			
			int tmp = friendship [i];
			friendship [i] = friendship [j];
			friendship [j] = tmp;
		}
		
		System.out.printf("%7s ",  "Id");
		for (int i = 0; i < friendship.length; i++) {
			System.out.printf("%3d ", i);
		}
		System.out.println();
		
		System.out.printf("%7s ",  "Friend");
		for (int friend: friendship) {
			System.out.printf("%3d ", friend);
		}
		System.out.println("\n----------------");
		
		boolean[] visited = new boolean[friendship.length];
		int nGroups = 0;
		for (int i = 0; i < friendship.length; i++) {
			
			if (visited [i]) continue;
			System.out.printf("Group %d: ", nGroups);
			while (!visited[i]) {
				visited[i] = true;
				System.out.printf("%d ", i);
				i = friendship [i];
			}
			System.out.println();	
			nGroups++;
			
		}
		System.out.println("Number of groups = " + nGroups);
	}
}

	