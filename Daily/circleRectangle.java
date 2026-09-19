public class circleRectangle {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int closestX = Math.max(x1, Math.min(xCenter, x2));
        int closestY = Math.max(y1, Math.min(yCenter, y2));

        int dx = xCenter - closestX;
        int dy = yCenter - closestY;

        return dx*dx + dy*dy <= radius*radius;
    }

    public static void main(String[] args) {
        int radius = 1, xCenter = 0, yCenter = 0, x1 = 1, y1 = -1, x2 = 3, y2 = 1;
        circleRectangle obj = new circleRectangle();

        System.out.println(obj.checkOverlap(radius, xCenter, yCenter, x1, y1, x2, y2));
    }
}
