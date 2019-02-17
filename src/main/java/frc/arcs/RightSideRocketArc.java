package frc.arcs;

import com.team319.follower.SrxMotionProfile;
import com.team319.follower.SrxTrajectory;

public class RightSideRocketArc extends SrxTrajectory {
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (2.00,13.50,0.00)
	// (7.00,13.00,30.00)
	// (9.00,12.50,60.00)
	
    public RightSideRocketArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public RightSideRocketArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.000,0.000,10.000,0.000},
				{2.608,26.076,10.000,0.000},
				{7.823,52.152,10.000,0.000},
				{15.646,78.228,10.000,0.000},
				{26.076,104.304,10.000,0.000},
				{39.114,130.380,10.000,0.010},
				{54.759,156.456,10.000,0.010},
				{73.013,182.532,10.000,0.020},
				{93.873,208.608,10.000,0.030},
				{117.342,234.684,10.000,0.050},
				{143.418,260.759,10.000,0.070},
				{172.101,286.835,10.000,0.100},
				{203.392,312.911,10.000,0.140},
				{237.291,338.987,10.000,0.180},
				{273.797,365.063,10.000,0.240},
				{312.911,391.139,10.000,0.320},
				{354.633,417.215,10.000,0.400},
				{398.962,443.291,10.000,0.510},
				{445.899,469.367,10.000,0.630},
				{495.443,495.443,10.000,0.770},
				{547.595,521.519,10.000,0.930},
				{602.354,547.595,10.000,1.120},
				{659.721,573.671,10.000,1.330},
				{719.696,599.747,10.000,1.560},
				{782.278,625.823,10.000,1.830},
				{847.468,651.899,10.000,2.120},
				{915.266,677.975,10.000,2.440},
				{985.671,704.051,10.000,2.800},
				{1058.683,730.126,10.000,3.190},
				{1134.304,756.202,10.000,3.610},
				{1212.531,782.278,10.000,4.070},
				{1293.367,808.354,10.000,4.560},
				{1376.810,834.430,10.000,5.090},
				{1462.861,860.506,10.000,5.650},
				{1551.519,886.582,10.000,6.250},
				{1642.785,912.658,10.000,6.880},
				{1736.658,938.734,10.000,7.550},
				{1833.139,964.810,10.000,8.250},
				{1932.228,990.886,10.000,8.990},
				{2033.924,1016.962,10.000,9.750},
				{2138.228,1043.038,10.000,10.530},
				{2245.139,1069.114,10.000,11.350},
				{2354.658,1095.190,10.000,12.180},
				{2466.784,1121.266,10.000,13.030},
				{2581.519,1147.342,10.000,13.890},
				{2698.860,1173.418,10.000,14.770},
				{2818.810,1199.494,10.000,15.650},
				{2941.367,1225.569,10.000,16.530},
				{3066.531,1251.645,10.000,17.410},
				{3194.303,1277.721,10.000,18.270},
				{3324.683,1303.797,10.000,19.130},
				{3457.670,1329.873,10.000,19.960},
				{3593.265,1355.949,10.000,20.780},
				{3731.468,1382.025,10.000,21.560},
				{3872.278,1408.101,10.000,22.310},
				{4015.696,1434.177,10.000,23.030},
				{4161.721,1460.253,10.000,23.700},
				{4310.354,1486.329,10.000,24.320},
				{4461.594,1512.405,10.000,24.900},
				{4615.442,1538.481,10.000,25.420},
				{4771.898,1564.557,10.000,25.880},
				{4928.354,1564.557,10.000,26.270},
				{5084.809,1564.557,10.000,26.600},
				{5241.265,1564.557,10.000,26.850},
				{5397.721,1564.557,10.000,27.030},
				{5554.176,1564.557,10.000,27.140},
				{5710.632,1564.557,10.000,27.170},
				{5867.088,1564.557,10.000,27.140},
				{6023.543,1564.557,10.000,27.030},
				{6179.999,1564.557,10.000,26.840},
				{6336.455,1564.557,10.000,26.570},
				{6492.911,1564.557,10.000,26.230},
				{6649.366,1564.557,10.000,25.810},
				{6805.822,1564.557,10.000,25.300},
				{6962.278,1564.557,10.000,24.710},
				{7118.733,1564.557,10.000,24.030},
				{7275.189,1564.557,10.000,23.260},
				{7431.645,1564.557,10.000,22.410},
				{7588.100,1564.557,10.000,21.460},
				{7744.556,1564.557,10.000,20.410},
				{7901.012,1564.557,10.000,19.270},
				{8057.467,1564.557,10.000,18.040},
				{8213.923,1564.557,10.000,16.710},
				{8370.379,1564.557,10.000,15.280},
				{8526.834,1564.557,10.000,13.770},
				{8683.290,1564.557,10.000,12.170},
				{8839.746,1564.557,10.000,10.480},
				{8996.201,1564.557,10.000,8.720},
				{9152.657,1564.557,10.000,6.900},
				{9309.113,1564.557,10.000,5.020},
				{9465.568,1564.557,10.000,3.090},
				{9622.024,1564.557,10.000,1.140},
				{9778.480,1564.557,10.000,-0.830},
				{9934.935,1564.557,10.000,-2.800},
				{10091.391,1564.557,10.000,-4.770},
				{10247.847,1564.557,10.000,-6.700},
				{10404.302,1564.557,10.000,-8.590},
				{10558.150,1538.481,10.000,-10.410},
				{10709.391,1512.405,10.000,-12.130},
				{10858.024,1486.329,10.000,-13.770},
				{11004.049,1460.253,10.000,-15.300},
				{11147.467,1434.177,10.000,-16.740},
				{11288.277,1408.101,10.000,-18.090},
				{11426.479,1382.025,10.000,-19.340},
				{11562.074,1355.949,10.000,-20.500},
				{11695.062,1329.873,10.000,-21.570},
				{11825.441,1303.797,10.000,-22.560},
				{11953.214,1277.721,10.000,-23.470},
				{12078.378,1251.645,10.000,-24.300},
				{12200.935,1225.569,10.000,-25.060},
				{12320.884,1199.494,10.000,-25.740},
				{12438.226,1173.418,10.000,-26.370},
				{12552.960,1147.342,10.000,-26.930},
				{12665.087,1121.266,10.000,-27.430},
				{12774.606,1095.190,10.000,-27.880},
				{12881.517,1069.114,10.000,-28.280},
				{12985.821,1043.038,10.000,-28.630},
				{13087.517,1016.962,10.000,-28.930},
				{13186.606,990.886,10.000,-29.190},
				{13283.087,964.810,10.000,-29.410},
				{13376.960,938.734,10.000,-29.590},
				{13468.226,912.658,10.000,-29.740},
				{13556.884,886.582,10.000,-29.850},
				{13642.935,860.506,10.000,-29.930},
				{13726.378,834.430,10.000,-29.980},
				{13726.378,834.430,10.000,-29.980},
				{13812.429,860.506,10.000,-30.000},
				{13901.087,886.582,10.000,-29.850},
				{13992.353,912.658,10.000,-29.220},
				{14086.226,938.734,10.000,-28.020},
				{14182.707,964.810,10.000,-26.160},
				{14281.796,990.886,10.000,-23.480},
				{14383.492,1016.962,10.000,-19.710},
				{14487.796,1043.038,10.000,-14.500},
				{14594.707,1069.114,10.000,-7.380},
				{14704.226,1095.190,10.000,2.000},
				{14816.352,1121.266,10.000,13.460},
				{14931.087,1147.342,10.000,25.720},
				{15048.428,1173.418,10.000,36.980},
				{15168.378,1199.494,10.000,46.190},
				{15290.935,1225.569,10.000,53.290},
				{15416.099,1251.645,10.000,58.700},
				{15543.871,1277.721,10.000,62.840},
				{15674.251,1303.797,10.000,66.080},
				{15807.238,1329.873,10.000,68.640},
				{15942.833,1355.949,10.000,70.700},
				{16081.036,1382.025,10.000,72.360},
				{16221.846,1408.101,10.000,73.730},
				{16365.264,1434.177,10.000,74.850},
				{16511.289,1460.253,10.000,75.760},
				{16659.922,1486.329,10.000,76.500},
				{16811.162,1512.405,10.000,77.090},
				{16965.010,1538.481,10.000,77.540},
				{17121.466,1564.557,10.000,77.860},
				{17277.922,1564.557,10.000,78.060},
				{17434.377,1564.557,10.000,78.140},
				{17590.833,1564.557,10.000,78.100},
				{17747.289,1564.557,10.000,77.940},
				{17903.744,1564.557,10.000,77.660},
				{18060.200,1564.557,10.000,77.230},
				{18216.656,1564.557,10.000,76.650},
				{18373.111,1564.557,10.000,75.870},
				{18529.567,1564.557,10.000,74.850},
				{18686.023,1564.557,10.000,73.530},
				{18842.478,1564.557,10.000,71.790},
				{18998.934,1564.557,10.000,69.470},
				{19155.390,1564.557,10.000,66.280},
				{19309.238,1538.481,10.000,61.810},
				{19460.478,1512.405,10.000,55.210},
				{19609.111,1486.329,10.000,45.000},
				{19755.137,1460.253,10.000,29.060},
				{19898.554,1434.177,10.000,7.840},
				{20039.364,1408.101,10.000,-11.690},
				{20177.567,1382.025,10.000,-25.040},
				{20313.162,1355.949,10.000,-33.540},
				{20446.149,1329.873,10.000,-39.170},
				{20576.529,1303.797,10.000,-43.120},
				{20704.301,1277.721,10.000,-46.020},
				{20829.466,1251.645,10.000,-48.240},
				{20952.023,1225.569,10.000,-49.990},
				{21071.972,1199.494,10.000,-51.410},
				{21189.314,1173.418,10.000,-52.570},
				{21304.048,1147.342,10.000,-53.540},
				{21416.174,1121.266,10.000,-54.370},
				{21525.693,1095.190,10.000,-55.070},
				{21632.605,1069.114,10.000,-55.680},
				{21736.908,1043.038,10.000,-56.210},
				{21838.605,1016.962,10.000,-56.670},
				{21937.693,990.886,10.000,-57.070},
				{22034.174,964.810,10.000,-57.430},
				{22128.048,938.734,10.000,-57.750},
				{22219.313,912.658,10.000,-58.030},
				{22307.972,886.582,10.000,-58.270},
				{22394.022,860.506,10.000,-58.490},
				{22477.465,834.430,10.000,-58.690},
				{22558.301,808.354,10.000,-58.860},
				{22636.529,782.278,10.000,-59.020},
				{22712.149,756.202,10.000,-59.150},
				{22785.162,730.126,10.000,-59.270},
				{22855.567,704.051,10.000,-59.380},
				{22923.364,677.975,10.000,-59.480},
				{22988.554,651.899,10.000,-59.560},
				{23051.136,625.823,10.000,-59.630},
				{23111.111,599.747,10.000,-59.690},
				{23168.478,573.671,10.000,-59.750},
				{23223.237,547.595,10.000,-59.800},
				{23275.389,521.519,10.000,-59.840},
				{23324.934,495.443,10.000,-59.870},
				{23371.870,469.367,10.000,-59.900},
				{23416.199,443.291,10.000,-59.920},
				{23457.921,417.215,10.000,-59.940},
				{23497.035,391.139,10.000,-59.960},
				{23533.541,365.063,10.000,-59.970},
				{23567.440,338.987,10.000,-59.980},
				{23598.731,312.911,10.000,-59.990},
				{23627.415,286.835,10.000,-59.990},
				{23653.491,260.759,10.000,-60.000},
				{23676.959,234.684,10.000,-60.000},
				{23697.820,208.608,10.000,-60.000},
				{23716.073,182.532,10.000,-60.000},
				{23731.718,156.456,10.000,-60.000},
				{23744.756,130.380,10.000,-60.000},
				{23755.187,104.304,10.000,-60.000},
				{23763.009,78.228,10.000,-60.000},
				{23768.225,52.152,10.000,-60.000}		};

}