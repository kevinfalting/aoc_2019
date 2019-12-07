import java.util.*;

class Main {
  public static void main(String[] args) {

    // 14228 - Not solved yet...
    String wire1 = "R995,D933,L284,U580,R453,U355,L352,U363,L506,D130,R300,D112,L751,U245,R174,U901,L586,D70,L348,U307,R596,D401,R311,D328,L612,D214,L161,U488,L813,U298,L299,D807,L791,D813,R946,U958,R258,D972,L72,U698,L170,D131,L552,D14,L760,U812,L203,D92,R483,U698,R800,U345,L947,D206,L991,D447,R832,D52,L134,D946,R108,D477,L818,D101,R784,U409,R23,U359,R981,D458,R786,U445,R874,U244,R381,U206,R86,U279,L787,U683,R52,U740,R210,U162,L748,U747,R283,D964,R782,D386,R205,D898,R774,U421,R908,D280,L567,D667,L302,D795,L822,D908,L160,U279,L58,D914,R828,U621,R338,U982,R471,U724,L509,U444,R377,D473,R307,U331,L529,U855,L474,U725,L905,U409,L881,U702,R162,D717,R498,U458,R119,U744,R2,D82,R337,D988,L235,U831,L373,D122,L310,D107,R685,U864,L356,U213,R246,U373,L809,U593,R582,U488,R847,U792,L182,U219,L232,D695,R183,U164,L730,D660,L581,D931,R36,D291,R614,U408,R928,D93,L685,D879,R37,D113,L563,D340,L212,D907,L557,D522,L610,D927,R11,U556,R571,U668,L834,U603,L407,U966,R245,D408,R822,U163,L265,D230,L144,D786,R479,U208,L781,D787,L146,U476,R561,U70,R879,U562,R805,D897,L44,U709,L773,U747,L806,U140,R953,D628,L752,D666,R916,D351,R175,D504,R232,U463,R415,U492,L252,D30,L574,U100,L333,U313,R403,D68,L976,D702,L205,D992,L552,U55,R216,U548,L894,U764,L919,U475,R656,U712,L754,U638,R33,U709,R643,U299,R151,U762,R767,D542,R581,D752,L701,D589,L312,U189,R922,D915,R975,U26,R244,U48,L971,U755,R889,D726,R126,U978,L275,D435,L732,D982,L654,D704,L98,U153,L983,U770,L429,U530,L545,D44,L36,U456,R442,D58,L321,U473,R657,U307,R314";
    String wire2 = "L999,U880,L754,D995,R105,U651,R762,U451,R612,U424,L216,D210,L946,U57,R685,U185,R234,D768,L927,U592,R545,U770,R456,D118,R22,U371,L721,D937,R144,U173,R337,D17,L948,U720,R617,D588,L57,U258,L979,U232,L473,D451,L829,D85,L985,D333,L492,D749,L972,U188,R214,D108,R247,U379,L218,D490,R451,U582,R674,D881,R725,U404,L916,U137,R745,D969,L206,D480,R634,U672,R897,D184,L768,D766,L529,U317,L909,D74,R529,D31,R483,D906,R961,D535,L937,D751,L564,U478,L439,U556,R385,D590,L518,D991,L232,D358,L962,U242,R856,U66,L847,U146,R196,U515,L892,U18,L535,U343,R430,U77,L967,U956,L64,D510,L29,D305,L954,U186,R624,D693,R354,D243,L145,D622,R456,U904,L233,D940,L82,D83,L726,D993,L338,D793,R340,D823,R147,D595,R296,D388,L106,D362,R114,U808,L496,U614,L809,U911,R480,D29,L802,U900,R920,U952,R237,D383,L480,U362,L761,U949,L920,D82,L511,U365,R657,U465,L256,U124,L810,U43,L668,U146,L847,D245,R937,D778,L995,D316,R423,U515,L626,D788,R453,U98,R886,U821,R749,D365,R915,U980,R322,D114,L556,D921,L551,D397,R232,D485,L842,D455,R940,U913,L196,D239,L221,D200,R438,U71,L979,U527,L86,U959,R768,D557,R553,D709,L838,U191,L916,D703,L687,U34,R463,D809,L3,U335,L231,D212,L674,U177,L51,D557,L939,U390,L28,U53,L653,D182,R329,D449,L563,D476,R258,D299,L142,U847,L38,U322,R294,U320,R314,D257,R622,U59,R501,D677,L880,U589,R599,D245,L851,U369,R262,D63,R722,D253,L546,U578,R909,U678,L63,U256,L237,U798,R465,D420,R797,D452,R548,U875,R523,D527,L467,U49,R726,D840,R882,U97,L398,D621,R38,U952,R196,D597,R627,D721,L441,D710,L18,D679,R218";


    //610
    // String wire1 = "R75,D30,R83,U83,L12,D49,R71,U7,L72";
    // String wire2 = "U62,R66,U55,R34,D71,R55,D58,R83";

    //410
    // String wire1 = "R98,U47,R26,D63,R33,U87,L62,D20,R33,U53,R51";
    // String wire2 = "U98,R91,D20,R16,D67,R40,U7,R15,U6,R7";  

    // 30
    // String wire1 = "R8,U5,L5,D3";
    // String wire2 = "U7,R6,D4,L4";

    // System.out.println("Problem 1\nManhattan Distance: " + prob1(wire1, wire2));
    // System.out.println("Problem 2\nFewest Steps: " + prob2(wire1, wire2));

    /*
      I could not get my approach to work so I found someone else's solution and
      copied it here. Even though I didn't solve this on my own, I learned how to
      implement a hashmap on this. I had initially considered a hashmap for the
      solution, but I couldn't figure out how to use two points as a key, but I
      did know I would have wanted to store their distances. Storing the two
      points as a string had not occurred to me, but now I know. "I see this as
      an absolute win!"

      Credit:
      https://github.com/boriskurikhin/AdventOfCode2019/blob/master/Day3.java
    */
    solve(wire1, wire2);
  }

  public static int[] getDir (char c) {
		switch (c) {
			case 'U': return new int[] {0,1};
			case 'D': return new int[] {0,-1};
			case 'L': return new int[] {-1,0};
			case 'R': return new int[] {1,0};
		}
		return null;
  }
  
  public static void solve(String wire1, String wire2) {
		
		Map<String, Integer> wire = new HashMap<String, Integer>();
		String[] input = wire1.split(",");
		
		int closestDistance = Integer.MAX_VALUE;
		int shortestWire = Integer.MAX_VALUE;
		
		int x = 0, y = 0, d = 0;
		
		for (int i = 0; i < input.length; i++) {
			int[] dir = getDir(input[i].charAt(0));
			int len = Integer.parseInt(input[i].substring(1));
			for (int j = 0; j < len; j++) {
				int newX = x + dir[0];
				int newY = y + dir[1];
				wire.put(newX + "_" + newY, ++d);
				x = newX;
				y = newY;
			}
		}
		input = wire2.split(",");
		x = y = d = 0;
		for (int i = 0; i < input.length; i++) {
			int[] dir = getDir(input[i].charAt(0));
			int len = Integer.parseInt(input[i].substring(1));
			for (int j = 0; j < len; j++) {
		
				int newX = x + dir[0];
				int newY = y + dir[1];
				d++;
				
				if (wire.containsKey(newX + "_" + newY)) {
					closestDistance = Math.min(closestDistance, (int) Math.abs(newX) + (int) Math.abs(newY)); /* Part 1 */
					shortestWire = Math.min(shortestWire, wire.get(newX + "_" + newY) + d);
				}
				x = newX;
				y = newY;
			}
		}
		System.out.println(closestDistance); /* Part 1 */
		System.out.println(shortestWire);
	}

  public static int prob1(String strWire1, String strWire2) {
    int[][] wire1 = getXY(strWire1.split(","));
    int[][] wire2 = getXY(strWire2.split(","));
    int collisions[][] = getCollisions(wire1, wire2);
    int[] closestCollision = getClosestCollision(collisions);
    return getManhattanDistance(closestCollision[0], closestCollision[1]);
  }

  public static int prob2(String strWire1, String strWire2) {
    int[][] wire1 = getXY(strWire1.split(","));
    int[][] wire2 = getXY(strWire2.split(","));

    int collisions[][] = getCollisions(wire1, wire2);

    int wire1_steps = 0;
    int wire2_steps = 0;

    for (int i = 0; i < collisions.length; i++) {
      wire1_steps = getSteps(wire1, collisions[i][0], collisions[i][1]);
      wire2_steps = getSteps(wire2, collisions[i][0], collisions[i][1]);
      System.out.printf("%5d | %5d | %d\n", wire1_steps, wire2_steps, wire1_steps + wire2_steps);
    }

    return wire1_steps + wire2_steps;
  }

  public static int getSteps(int[][] wire, int x_target, int y_target) {
    ArrayList<int[]> plot = new ArrayList<>();
    int x = 0, y = 0, i = 0;
    plot.add(new int[]{x,y});
    // System.out.println("Target: (" + x_target + ", " + y_target + ")");

    while (x != x_target || y != y_target) {
      if (wire[i][0] < x) {
        x--;
      } else if (wire[i][0] > x) {
        x++;
      } else if (wire[i][1] < y) {
        y--;
      } else if (wire[i][1] > y) {
        y++;
      } else {
        i++;
        continue;
      }

      int[] point = {x, y};
      plot.add(point);
    }

    // for (int j = 0; j < plot.size(); j++) {
    //   System.out.printf("(%d, %d)\n", plot.get(j)[0], plot.get(j)[1]);
    // }

    // System.out.printf("Raw: %d, ", plot.size() - 1);
    
    for (int a = 0; a < plot.size() - 1; a++) {
      for (int b = a+1; b < plot.size(); b++) {
        if (Arrays.equals(plot.get(a), plot.get(b))) {
          ArrayList<int[]> firstHalf = new ArrayList<>();
          ArrayList<int[]> secondHalf = new ArrayList<>();
          for (int f = 0; f <= a; f++) {
            firstHalf.add(plot.get(f));
          }
          for (int s = b+1; s < plot.size(); s++) {
            secondHalf.add(plot.get(s));
          }
          firstHalf.addAll(secondHalf);
          plot = firstHalf;
          b = a;
        }
      }
    }

    // System.out.println("Trimmed: " + (plot.size() - 1));

    return plot.size() - 1;
  }

  public static int[][] getXY(String wire[]) {
    int[][] xyWire = new int[wire.length][2];
    int x = 0;
    int y = 0;

    for (int i = 0; i < wire.length; i++) {
      char direction = wire[i].charAt(0);
      int value = Integer.parseInt(wire[i].substring(1));
      if (direction == 'U') {
        y += value;
      } else if (direction == 'D') {
        y -= value;
      } else if (direction == 'R') {
        x += value;
      } else if (direction == 'L') {
        x -= value;
      }

      xyWire[i][0] = x;
      xyWire[i][1] = y;
    }

    return xyWire;
  }

  public static int[][] getCollisions(int[][] wire1, int[][] wire2) {
    ArrayList<Integer> xCollision = new ArrayList<>();
    ArrayList<Integer> yCollision = new ArrayList<>();

    for (int i = 0; i < wire1.length - 1; i++) {
      int x1 = wire1[i][0];
      int x2 = wire1[i+1][0];
      int y1 = wire1[i][1];
      int y2 = wire1[i+1][1];
      for (int j = 0; j < wire2.length - 1; j++) {
        int a1 = wire2[j][0]; //x1
        int a2 = wire2[j+1][0]; //x2
        int b1 = wire2[j][1]; //y1
        int b2 = wire2[j+1][1]; //y2

        if (isPerpendicular(x1, y1, x2, y2, a1, b1, a2, b2)) {
          if (isBetween(a1, x1, x2) && isBetween(y1, b1, b2)) {
            xCollision.add(a1);
            yCollision.add(y2);
          } else if (isBetween(x1, a1, a2) && isBetween(b1, y1, y2)) {
            xCollision.add(x1);
            yCollision.add(b2);
          }
        }
      }
    }

    int[][] collisions = new int[xCollision.size()][2];
    for (int i = 0; i < xCollision.size(); i++) {
      collisions[i][0] = xCollision.get(i);
      collisions[i][1] = yCollision.get(i);
    }

    return collisions;
  }

  public static boolean isPerpendicular(int x1, int y1, int x2, int y2, int a1, int b1, int a2, int b2) {
    return y1 == y2 && a1 == a2 || b1 == b2 && x1 == x2;
  }

  // is a between b and c?
  public static boolean isBetween(int a, int b, int c) {
    int min = b < c ? b : c;
    int max = b < c ? c : b;
    return a >= min && a <= max; 
  }

  public static int[] getClosestCollision(int collisions[][]) {
    // if (collisions.length == 0) return null;
    int low = getManhattanDistance(collisions[0][0], collisions[0][1]);
    int x = collisions[0][0];
    int y = collisions[0][1];

    for (int i = 1; i < collisions.length; i++) {
      if (getManhattanDistance(collisions[i][0], collisions[i][1]) < low) {
        low = getManhattanDistance(collisions[i][0], collisions[i][1]);
        x = collisions[i][0];
        y = collisions[i][1];
      }
    }

    int closestCollision[] = {x,y};
    return closestCollision;
  }

  public static int getManhattanDistance(int x, int y) {
    return Math.abs(x) + Math.abs(y);
  }
}