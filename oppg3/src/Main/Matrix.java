package Main;
import java.util.ArrayList;
import java.util.Arrays;

public final class Matrix
{
    private final int[][] matrix;
    private final int rows;
    private final int cols;
    Matrix(int rows, int cols)//Create matrix of specified size filled with 0s
    {
        this.rows = rows;
        this.cols = cols;
        this.matrix = new int[rows][cols];
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                this.matrix[i][j] = 0;
            }
        }
    }
    Matrix(int dims) {this(dims, dims);}
    Matrix(int[][] matrix)
    {
        rows = matrix.length;
        cols = matrix[0].length;
        this.matrix = matrix;
    }
    int[] GetDims()
    {
        return new int[]{rows, cols};
    }
    int[][] GetMatrixArray() {return matrix;}
    Matrix GetMatrix() {return this;}
    Matrix Add(Matrix rhs)
    {
        if(Arrays.equals(rhs.GetDims(), GetDims()))
        {
            int[][] rhsArray = rhs.GetMatrixArray();
            for(int i = 0; i < rows; i++)
            {
                for(int j = 0; j < cols; j++)
                {
                    rhsArray[i][j] += matrix[i][j];
                }
            }
            return new Matrix(rhsArray);
        }
        return null;
    }
    Matrix Multiply(Matrix rhs)
    {
        int[] rhsDims = rhs.GetDims();
        if(rhsDims[0] == cols)
        {
            int[][] rhsArray = rhs.GetMatrixArray();
            int[][] temp = new int[rows][rhsDims[1]];
            for(int row = 0; row < rows; row++)
            {
                for(int col = 0; col < rhsDims[1]; col++)
                {
                    temp[row][col] = 0;
                    for(int i = 0; i < cols; i++)
                    {
                        temp[row][col] += matrix[row][i] * rhsArray[i][col];
                    }
                }
            }
            return new Matrix(temp);
        }
        return null;
    }
    Matrix Transpose()
    {
        int[][] temp = new int[cols][rows];
        for(int col = 0; col < cols; col++)
        {
            for(int row = 0; row < rows; row++)
            {
                temp[col][row] = matrix[row][col];
            }
        }
        return new Matrix(temp);
    }
}