package interfaces;

public class Drawing implements Printable{
    int i;
    int j;
    char c;
    char[][] d;

    Drawing(int i, int j, char c) {
        d = new char[i][j];
        for (int k = 0; k < i; k++)
            for (int l = 0; l < j; l++) d[k][l] = c;
    }

    @Override
    public void print() {
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                System.out.print(d[i][j] + "\t");
            } System.out.println();
        }
    }

    void SetPoint(int x, int y, char z){
        d[y][x] = z;
    }

    void drawVerticalLine(int stLine, int endLine, int column, char symbol){
        if (stLine > endLine) {
            int a = stLine;
            stLine = endLine;
            endLine = a;
        }
        for (i = stLine; i <= endLine; i++){
            d[i][column] = symbol;
        }
    }

    void drawHorizontalLine(int line, int stColumn, int endColumn, char symbol){
        if (stColumn > endColumn) {
            int a = stColumn;
            stColumn = endColumn;
            endColumn = a;
        }
        for (j = stColumn; j <= endColumn; j++){
            d[line][j] = symbol;
        }
    }

    void drawRectangle(int topX, int topY, int bottomX, int bottomY){
        drawHorizontalLine(topY, bottomX, topX, '-');
        drawHorizontalLine(bottomY, bottomX, topX, '-');
        drawVerticalLine(topY, bottomY, topX, '|');
        drawVerticalLine(topY, bottomY, bottomX, '|');
        d[topY][topX] = '+';
        d[bottomY][bottomX] = '+';
        d[bottomX][topY] = '+';
        d[bottomY][topX] = '+';
    }

}
