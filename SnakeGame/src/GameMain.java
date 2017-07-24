public class GameMain {
	public static void main(String[] args) {
		Tile[] arr = new Tile[100];

		for (int i = 0; i < arr.length; i++) {

			if (i % 5 == 0) {
				arr[i] = new Trap("Ʈ��" + i);
				continue;
			}
			arr[i] = new Tile("Ÿ��" + i);
		}

		TileBoard board = new TileBoard(arr);

		Player player1 = new Player("��ȫ��", arr[0], 0);
		Player player2 = new Player("������", arr[0], 0);

		while (true) {

			int dice1 = (int) (Math.random() * 6) + 1;
			int dice2 = (int) (Math.random() * 6) + 1;

			Tile target1 = arr[player1.position + dice1];
			Tile target2 = arr[player2.position + dice2];

			player1.current = target1;
			player2.current = target2;
			player1.position += dice1;
			player2.position += dice2;

	
//			System.out.println("P1 Ÿ�� " + player1.current);
			System.out.println("P1 ������ġ " + player1.position);
			System.out.println("----------------------------");
//			System.out.println("P2 Ÿ�� " + player2.current);
			System.out.println("P2 ������ġ " + player2.position);
			System.out.println("==============================");
			
			if (target1.pass(player1) == false) {
				System.out.println("P1 �׾���!");
				break;
			}
			if (target2.pass(player2) == false) {
				System.out.println("P2 �׾���!");
				break;
			}

		}
	}
}
