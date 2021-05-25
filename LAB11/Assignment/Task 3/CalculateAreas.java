package Assignment;

public class CalculateAreas {

    public static double[] Area(Shape[] obj) {
        double[] area;
        area = new double[obj.length];
        for (int i = 0; i < obj.length; i++) {
            if (obj[i] != null) {
                area[i] = obj[i].area();
            }}
        return area;
    }}
