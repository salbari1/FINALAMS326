import java.util.Random;
import java.util.Arrays;



public class FinalProblem4 {
	
	static double bin1;
	static double bin2;
	static double bin3;
	static double bin4;
	static double bin5;
	static double bin6;
	static double bin7;
		
		public static double RandomNorm (double mean, double sd) {
			Random r = new Random();
			double val = (r.nextGaussian() * sd + mean);
			return val;
		}
		static double[][] multiplyMatrix(double[][] firstMatrix, double[][] secondMatrix) {
		    double[][] result = new double[firstMatrix.length][secondMatrix[0].length];
		 
		    for (int row = 0; row < result.length; row++) {
		        for (int col = 0; col < result[row].length; col++) {
		            result[row][col] = multiplyMatrixCell(firstMatrix, secondMatrix, row, col);
		        }
		    }
		 
		    return result;
		}
		static double multiplyMatrixCell(double[][] firstMatrix, double[][] secondMatrix, int row, int col) {
		    double cell = 0;
		    for (int i = 0; i < secondMatrix.length; i++) {
		        cell += firstMatrix[row][i] * secondMatrix[i][col];
		    }
		    return cell;
		}

		public static void main(String[] args) {
			
			
		    double[][] matrix3 = new double[(int) Math.pow(2,12)][(int) Math.pow(2,12)];

		    for (int i1 = 0; i1 < 4096; i1++) {
		        for (int j = 0; j < 4096; j++) {
		        	matrix3[i1][j] = RandomNorm(0,1);
		        }
		    }
		    double[][] matrix4 = new double[(int) Math.pow(2,12)][(int) Math.pow(2,12)];

		    for (int i1 = 0; i1 < 4096; i1++) {
		        for (int j = 0; j < 4096; j++) {
		        	matrix4[i1][j] = RandomNorm(0,1);
		        }
		    }
		    double[][] actual2 = multiplyMatrix(matrix3, matrix4);
		    for (int i1 = 0; i1 < actual2.length; i1++) {
		        for (int j = 0; j < actual2[i1].length; j++) {
		            if (actual2[i1][j] < -1) {
		            	bin1++;
		            }
		            else if (actual2[i1][j] >=-1 && actual2[i1][j] <- 0.5) {
		            	bin2++;
		            }
		            else if (actual2[i1][j] >= -0.5 && actual2[i1][j] < -0.25) {
		            	bin3++;
		            }
		            else if (actual2[i1][j] >= -.25 && actual2[i1][j] < .25) {
		            	bin4++;
		            }
		            else if (actual2[i1][j] >= .25 && actual2[i1][j] < .5) {
		            	bin5++;
		            }
		            else if (actual2[i1][j] >=.5 && actual2[i1][j] < 1) {
		            	bin6++;
		            }
		            else if (actual2[i1][j] >=1) {
		            	bin7++;
		            }
		        }
		    }
		    System.out.println(bin1);
		    System.out.println(bin2);
		    System.out.println(bin3);
		    System.out.println(bin4);
		    System.out.println(bin5);
		    System.out.println(bin6);
		    System.out.println(bin7);
		   
		    }
		}




