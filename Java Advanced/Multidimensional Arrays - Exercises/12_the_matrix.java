
import java.util.*;


public class TestingGround {
    public static void main(String[] args) {
        readInput();
    }

    public static void readInput() {
        Scanner scanner = new Scanner(System.in);
        String str[] = scanner.nextLine().split(" ");
        int r = Integer.parseInt(str[0]);
        int c = Integer.parseInt(str[1]);
        char table [][] = new char[r][c];
        String line[];
        for(int i=0;i<r;i++)
        {
            line = scanner.nextLine().split(" ");
            for(int j=0;j<c;j++)
            {
                table[i][j] = line[j].charAt(0);
            }
        }
        char fillChar = scanner.nextLine().charAt(0);
        str = scanner.nextLine().split(" ");
        int startRow  = Integer.parseInt(str[0]);
        int startCol  = Integer.parseInt(str[1]);
        long startTime = System.currentTimeMillis();
       // matrixBFS(table,fillChar,startRow,startCol);
        matrixDFS(table,fillChar,startRow,startCol,table[startRow][startCol]);
        printTable(table);
//         System.out.printf("Time is %d\n",System.currentTimeMillis()-startTime);

    }

    public static void matrixBFS(char table[][],char fillChar,int startRow,int startCol)// BFS solution
    {
        char startChar = table[startRow][startCol];
        MyPair startPair = new MyPair(startRow,startCol);
        Queue<MyPair> queue = new LinkedList<>();
        queue.add(startPair);
        while(!queue.isEmpty())
        {

            MyPair cur = queue.remove();
            table[cur.x][cur.y]=fillChar;
            if(cur.x+1<table.length&&table[cur.x+1][cur.y]==startChar)
            {
                table[cur.x+1][cur.y] = fillChar;
                queue.add(new MyPair(cur.x+1,cur.y));
            }

            if(cur.y+1<table[0].length&&table[cur.x][cur.y+1]==startChar)
            {
                table[cur.x][cur.y+1] = fillChar;
                queue.add(new MyPair(cur.x,cur.y+1));
            }

            if(cur.x-1>=0&&table[cur.x-1][cur.y]==startChar)
            {
                table[cur.x-1][cur.y] = fillChar;
                queue.add(new MyPair(cur.x-1,cur.y));
            }

            if(cur.y-1>=0&&table[cur.x][cur.y-1]==startChar)
            {
                table[cur.x][cur.y-1] = fillChar;
                queue.add(new MyPair(cur.x,cur.y-1));

            }

        }

    }

    public static void matrixDFS(char table[][],char fillChar,int currentRow,int currentCol,char startChar)
    {
        table[currentRow][currentCol]=fillChar;
        matrixDFSHelper(table, fillChar, currentRow, currentCol, startChar);
    }

    public static void matrixDFSHelper(char table[][],char fillChar,int currentRow,int currentCol,char startChar)// DFS solution
    {
        if(currentRow+1<table.length&&table[currentRow+1][currentCol]==startChar)
        {
            table[currentRow+1][currentCol] = fillChar;
            matrixDFSHelper(table,fillChar,currentRow+1,currentCol,startChar);
        }

        if(currentCol+1<table[0].length&&table[currentRow][currentCol+1]==startChar)
        {
            table[currentRow][currentCol+1] = fillChar;
            matrixDFSHelper(table,fillChar,currentRow,currentCol+1,startChar);
        }

        if(currentRow-1>=0&&table[currentRow-1][currentCol]==startChar)
        {
            table[currentRow-1][currentCol] = fillChar;
            matrixDFSHelper(table,fillChar,currentRow-1,currentCol,startChar);
        }
        if(currentCol-1>=0&&table[currentRow][currentCol-1]==startChar)
        {
            table[currentRow][currentCol-1] = fillChar;
            matrixDFSHelper(table,fillChar,currentRow,currentCol-1,startChar);
        }


    }

    public static void printTable(char table[][])
    {
        for(int i=0;i<table.length;i++)
        {
            for(int j=0;j<table[0].length;j++)
            {
                System.out.printf("%c",table[i][j]);
            }System.out.printf("\n");
        }
    }

    /**
     * Useful for BFS solution
     */
    static class MyPair
    {
        int x;
        int y;
        public MyPair(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
        public String toString()
        {
         return String.format("[%d,%d]",x,y);
        }
    }

}