package Main;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Matrix a = new Matrix(new int[][]{  { 1,  2,  4},
                                            { 0, -4,  2},
                                            { 2,  4,  1}});
        Matrix b = new Matrix(new int[][]{  {-1,  0, 11},
                                            { 0,  3, -2},
                                            { 1,  1,  1}});

        Matrix c = new Matrix(new int[][]{  { 1,  2,  4, 5},
                                            { 0, -4,  2, 1}});
        Matrix d = new Matrix(new int[][]{  {-1,  0,  3},
                                            { 0,  3,  1},
                                            { 1,  1,  6},
                                            { 2,  2, -1}});
        System.out.println(Arrays.deepToString(a.Add(b.GetMatrix()).GetMatrixArray()));
        System.out.println(Arrays.deepToString(c.Multiply(d.GetMatrix()).GetMatrixArray()));
        System.out.println(Arrays.deepToString(c.Multiply(c.Transpose().GetMatrix()).GetMatrixArray()));
    }
}