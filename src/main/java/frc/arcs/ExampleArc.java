package frc.arcs;

import com.team319.follower.SrxMotionProfile;
import com.team319.follower.SrxTrajectory;

public class ExampleArc extends SrxTrajectory {
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.15,3.79,0.00)
	// (4.15,3.79,0.00)
	// (9.15,8.79,0.00)
	
    public ExampleArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public ExampleArc(boolean flipped) {
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
				{39.114,130.380,10.000,0.000},
				{54.759,156.456,10.000,0.000},
				{73.013,182.532,10.000,0.000},
				{93.873,208.608,10.000,0.000},
				{117.342,234.684,10.000,0.000},
				{143.418,260.759,10.000,0.000},
				{172.101,286.835,10.000,0.000},
				{203.392,312.911,10.000,0.000},
				{237.291,338.987,10.000,0.000},
				{273.797,365.063,10.000,0.000},
				{312.911,391.139,10.000,0.000},
				{354.633,417.215,10.000,0.000},
				{398.962,443.291,10.000,0.000},
				{445.899,469.367,10.000,0.000},
				{495.443,495.443,10.000,0.000},
				{547.595,521.519,10.000,0.000},
				{602.354,547.595,10.000,0.000},
				{659.721,573.671,10.000,0.000},
				{719.696,599.747,10.000,0.000},
				{782.278,625.823,10.000,0.000},
				{847.468,651.899,10.000,0.000},
				{915.266,677.975,10.000,0.000},
				{985.671,704.051,10.000,0.000},
				{1058.683,730.126,10.000,0.000},
				{1134.304,756.202,10.000,0.000},
				{1212.531,782.278,10.000,0.000},
				{1293.367,808.354,10.000,0.000},
				{1376.810,834.430,10.000,0.000},
				{1462.861,860.506,10.000,0.000},
				{1551.519,886.582,10.000,0.000},
				{1642.785,912.658,10.000,0.000},
				{1736.658,938.734,10.000,0.000},
				{1833.139,964.810,10.000,0.000},
				{1932.228,990.886,10.000,0.000},
				{2033.924,1016.962,10.000,0.000},
				{2138.228,1043.038,10.000,0.000},
				{2245.139,1069.114,10.000,0.000},
				{2354.658,1095.190,10.000,0.000},
				{2466.784,1121.266,10.000,0.000},
				{2581.519,1147.342,10.000,0.000},
				{2698.860,1173.418,10.000,0.000},
				{2818.810,1199.494,10.000,0.000},
				{2941.367,1225.569,10.000,0.000},
				{3066.531,1251.645,10.000,0.000},
				{3194.303,1277.721,10.000,0.000},
				{3324.683,1303.797,10.000,0.000},
				{3455.063,1303.797,10.000,0.000},
				{3585.443,1303.797,10.000,0.000},
				{3715.822,1303.797,10.000,0.000},
				{3846.202,1303.797,10.000,0.000},
				{3976.582,1303.797,10.000,0.000},
				{4106.961,1303.797,10.000,0.000},
				{4237.341,1303.797,10.000,0.000},
				{4367.721,1303.797,10.000,0.000},
				{4498.101,1303.797,10.000,0.000},
				{4628.480,1303.797,10.000,0.000},
				{4758.860,1303.797,10.000,0.000},
				{4889.240,1303.797,10.000,0.000},
				{5019.620,1303.797,10.000,0.000},
				{5149.999,1303.797,10.000,0.000},
				{5277.771,1277.721,10.000,0.000},
				{5402.936,1251.645,10.000,0.000},
				{5525.493,1225.569,10.000,0.000},
				{5645.442,1199.494,10.000,0.000},
				{5762.784,1173.418,10.000,0.000},
				{5877.518,1147.342,10.000,0.000},
				{5989.645,1121.266,10.000,0.000},
				{6099.164,1095.190,10.000,0.000},
				{6206.075,1069.114,10.000,0.000},
				{6310.379,1043.038,10.000,0.000},
				{6412.075,1016.962,10.000,0.000},
				{6511.164,990.886,10.000,0.000},
				{6607.645,964.810,10.000,0.000},
				{6701.518,938.734,10.000,0.000},
				{6792.784,912.658,10.000,0.000},
				{6881.442,886.582,10.000,0.000},
				{6967.493,860.506,10.000,0.000},
				{7050.936,834.430,10.000,0.000},
				{7131.771,808.354,10.000,0.000},
				{7209.999,782.278,10.000,0.000},
				{7285.619,756.202,10.000,0.000},
				{7358.632,730.126,10.000,0.000},
				{7429.037,704.051,10.000,0.000},
				{7496.834,677.975,10.000,0.000},
				{7562.024,651.899,10.000,0.000},
				{7624.607,625.823,10.000,0.000},
				{7684.581,599.747,10.000,0.000},
				{7741.948,573.671,10.000,0.000},
				{7741.948,573.671,10.000,0.000},
				{7794.100,521.519,10.000,0.000},
				{7846.252,521.519,10.000,0.000},
				{7898.404,521.519,10.000,-0.010},
				{7950.556,521.519,10.000,-0.020},
				{8002.708,521.519,10.000,-0.040},
				{8054.860,521.519,10.000,-0.070},
				{8107.012,521.519,10.000,-0.100},
				{8159.163,521.519,10.000,-0.140},
				{8211.315,521.519,10.000,-0.190},
				{8263.467,521.519,10.000,-0.240},
				{8315.619,521.519,10.000,-0.300},
				{8367.771,521.519,10.000,-0.360},
				{8419.923,521.519,10.000,-0.440},
				{8472.075,521.519,10.000,-0.510},
				{8524.227,521.519,10.000,-0.600},
				{8576.379,521.519,10.000,-0.690},
				{8628.530,521.519,10.000,-0.790},
				{8680.682,521.519,10.000,-0.890},
				{8732.834,521.519,10.000,-1.000},
				{8784.986,521.519,10.000,-1.120},
				{8837.138,521.519,10.000,-1.240},
				{8889.290,521.519,10.000,-1.370},
				{8941.442,521.519,10.000,-1.510},
				{8993.594,521.519,10.000,-1.660},
				{9045.746,521.519,10.000,-1.810},
				{9097.898,521.519,10.000,-1.960},
				{9150.049,521.519,10.000,-2.130},
				{9202.201,521.519,10.000,-2.300},
				{9254.353,521.519,10.000,-2.480},
				{9306.505,521.519,10.000,-2.660},
				{9358.657,521.519,10.000,-2.860},
				{9410.809,521.519,10.000,-3.060},
				{9462.961,521.519,10.000,-3.260},
				{9515.113,521.519,10.000,-3.480},
				{9567.265,521.519,10.000,-3.700},
				{9619.416,521.519,10.000,-3.930},
				{9671.568,521.519,10.000,-4.170},
				{9723.720,521.519,10.000,-4.420},
				{9775.872,521.519,10.000,-4.670},
				{9828.024,521.519,10.000,-4.930},
				{9880.176,521.519,10.000,-5.200},
				{9932.328,521.519,10.000,-5.480},
				{9984.480,521.519,10.000,-5.770},
				{10036.632,521.519,10.000,-6.070},
				{10088.783,521.519,10.000,-6.380},
				{10140.935,521.519,10.000,-6.690},
				{10193.087,521.519,10.000,-7.020},
				{10245.239,521.519,10.000,-7.350},
				{10297.391,521.519,10.000,-7.700},
				{10349.543,521.519,10.000,-8.050},
				{10401.695,521.519,10.000,-8.420},
				{10453.847,521.519,10.000,-8.790},
				{10505.999,521.519,10.000,-9.180},
				{10558.150,521.519,10.000,-9.580},
				{10610.302,521.519,10.000,-9.990},
				{10662.454,521.519,10.000,-10.400},
				{10714.606,521.519,10.000,-10.840},
				{10766.758,521.519,10.000,-11.280},
				{10818.910,521.519,10.000,-11.730},
				{10871.062,521.519,10.000,-12.200},
				{10923.214,521.519,10.000,-12.680},
				{10975.366,521.519,10.000,-13.170},
				{11027.518,521.519,10.000,-13.670},
				{11079.669,521.519,10.000,-14.190},
				{11131.821,521.519,10.000,-14.720},
				{11183.973,521.519,10.000,-15.260},
				{11236.125,521.519,10.000,-15.820},
				{11288.277,521.519,10.000,-16.390},
				{11340.429,521.519,10.000,-16.970},
				{11392.581,521.519,10.000,-17.570},
				{11444.733,521.519,10.000,-18.180},
				{11496.885,521.519,10.000,-18.810},
				{11549.036,521.519,10.000,-19.450},
				{11601.188,521.519,10.000,-20.100},
				{11653.340,521.519,10.000,-20.770},
				{11705.492,521.519,10.000,-21.450},
				{11757.644,521.519,10.000,-22.150},
				{11809.796,521.519,10.000,-22.860},
				{11861.948,521.519,10.000,-23.590},
				{11914.100,521.519,10.000,-24.330},
				{11966.252,521.519,10.000,-25.080},
				{12018.403,521.519,10.000,-25.850},
				{12070.555,521.519,10.000,-26.630},
				{12122.707,521.519,10.000,-27.420},
				{12174.859,521.519,10.000,-28.230},
				{12227.011,521.519,10.000,-29.050},
				{12279.163,521.519,10.000,-29.880},
				{12331.315,521.519,10.000,-30.720},
				{12383.467,521.519,10.000,-31.580},
				{12435.619,521.519,10.000,-32.440},
				{12487.770,521.519,10.000,-33.310},
				{12539.922,521.519,10.000,-34.190},
				{12592.074,521.519,10.000,-35.080},
				{12644.226,521.519,10.000,-35.980},
				{12696.378,521.519,10.000,-36.890},
				{12748.530,521.519,10.000,-37.800},
				{12800.682,521.519,10.000,-38.710},
				{12852.834,521.519,10.000,-39.630},
				{12904.986,521.519,10.000,-40.550},
				{12957.138,521.519,10.000,-41.480},
				{13009.289,521.519,10.000,-42.400},
				{13061.441,521.519,10.000,-43.330},
				{13113.593,521.519,10.000,-44.250},
				{13165.745,521.519,10.000,-45.180},
				{13217.897,521.519,10.000,-46.100},
				{13270.049,521.519,10.000,-47.010},
				{13322.201,521.519,10.000,-47.920},
				{13374.353,521.519,10.000,-48.830},
				{13426.505,521.519,10.000,-49.730},
				{13478.656,521.519,10.000,-50.620},
				{13530.808,521.519,10.000,-51.500},
				{13582.960,521.519,10.000,-52.380},
				{13635.112,521.519,10.000,-53.250},
				{13687.264,521.519,10.000,-54.100},
				{13739.416,521.519,10.000,-54.950},
				{13791.568,521.519,10.000,-55.780},
				{13843.720,521.519,10.000,-56.600},
				{13895.872,521.519,10.000,-57.410},
				{13948.023,521.519,10.000,-58.210},
				{14000.175,521.519,10.000,-58.990},
				{14052.327,521.519,10.000,-59.760},
				{14104.479,521.519,10.000,-60.520},
				{14156.631,521.519,10.000,-61.260},
				{14208.783,521.519,10.000,-61.990},
				{14260.935,521.519,10.000,-62.710},
				{14313.087,521.519,10.000,-63.410},
				{14365.239,521.519,10.000,-64.090},
				{14417.390,521.519,10.000,-64.760},
				{14469.542,521.519,10.000,-65.420},
				{14521.694,521.519,10.000,-66.070},
				{14573.846,521.519,10.000,-66.690},
				{14625.998,521.519,10.000,-67.310},
				{14678.150,521.519,10.000,-67.910},
				{14730.302,521.519,10.000,-68.500},
				{14782.454,521.519,10.000,-69.070},
				{14834.606,521.519,10.000,-69.630},
				{14886.758,521.519,10.000,-70.180},
				{14938.909,521.519,10.000,-70.710},
				{14991.061,521.519,10.000,-71.230},
				{15043.213,521.519,10.000,-71.740},
				{15095.365,521.519,10.000,-72.230},
				{15147.517,521.519,10.000,-72.720},
				{15199.669,521.519,10.000,-73.190},
				{15251.821,521.519,10.000,-73.650},
				{15303.973,521.519,10.000,-74.090},
				{15356.125,521.519,10.000,-74.530},
				{15408.276,521.519,10.000,-74.950},
				{15460.428,521.519,10.000,-75.360},
				{15512.580,521.519,10.000,-75.760},
				{15564.732,521.519,10.000,-76.160},
				{15616.884,521.519,10.000,-76.540},
				{15669.036,521.519,10.000,-76.910},
				{15721.188,521.519,10.000,-77.270},
				{15773.340,521.519,10.000,-77.620},
				{15825.492,521.519,10.000,-77.960},
				{15877.643,521.519,10.000,-78.290},
				{15929.795,521.519,10.000,-78.610},
				{15981.947,521.519,10.000,-78.930},
				{16034.099,521.519,10.000,-79.230},
				{16086.251,521.519,10.000,-79.530},
				{16138.403,521.519,10.000,-79.810},
				{16190.555,521.519,10.000,-80.090},
				{16242.707,521.519,10.000,-80.360},
				{16294.859,521.519,10.000,-80.630},
				{16347.010,521.519,10.000,-80.880},
				{16399.162,521.519,10.000,-81.130},
				{16451.314,521.519,10.000,-81.370},
				{16503.466,521.519,10.000,-81.610},
				{16555.618,521.519,10.000,-81.830},
				{16607.770,521.519,10.000,-82.050},
				{16659.922,521.519,10.000,-82.260},
				{16712.074,521.519,10.000,-82.470},
				{16764.226,521.519,10.000,-82.670},
				{16816.377,521.519,10.000,-82.860},
				{16868.529,521.519,10.000,-83.050},
				{16920.681,521.519,10.000,-83.230},
				{16972.833,521.519,10.000,-83.400},
				{17024.985,521.519,10.000,-83.570},
				{17077.137,521.519,10.000,-83.730},
				{17129.289,521.519,10.000,-83.880},
				{17181.441,521.519,10.000,-84.030},
				{17233.593,521.519,10.000,-84.180},
				{17285.745,521.519,10.000,-84.320},
				{17337.896,521.519,10.000,-84.450},
				{17390.048,521.519,10.000,-84.580},
				{17442.200,521.519,10.000,-84.700},
				{17494.352,521.519,10.000,-84.820},
				{17546.504,521.519,10.000,-84.930},
				{17598.656,521.519,10.000,-85.040},
				{17650.808,521.519,10.000,-85.140},
				{17702.960,521.519,10.000,-85.240},
				{17755.112,521.519,10.000,-85.330},
				{17807.263,521.519,10.000,-85.410},
				{17859.415,521.519,10.000,-85.500},
				{17911.567,521.519,10.000,-85.570},
				{17963.719,521.519,10.000,-85.650},
				{18015.871,521.519,10.000,-85.710},
				{18068.023,521.519,10.000,-85.780},
				{18120.175,521.519,10.000,-85.840},
				{18172.327,521.519,10.000,-85.890},
				{18224.479,521.519,10.000,-85.940},
				{18276.630,521.519,10.000,-85.980},
				{18328.782,521.519,10.000,-86.020},
				{18380.934,521.519,10.000,-86.060},
				{18433.086,521.519,10.000,-86.090},
				{18485.238,521.519,10.000,-86.120},
				{18537.390,521.519,10.000,-86.140},
				{18589.542,521.519,10.000,-86.160},
				{18641.694,521.519,10.000,-86.170},
				{18693.846,521.519,10.000,-86.180},
				{18745.997,521.519,10.000,-86.190},
				{18798.149,521.519,10.000,-86.190},
				{18850.301,521.519,10.000,-86.180},
				{18902.453,521.519,10.000,-86.170},
				{18954.605,521.519,10.000,-86.160},
				{19006.757,521.519,10.000,-86.140},
				{19058.909,521.519,10.000,-86.120},
				{19111.061,521.519,10.000,-86.090},
				{19163.213,521.519,10.000,-86.060},
				{19215.365,521.519,10.000,-86.030},
				{19267.516,521.519,10.000,-85.990},
				{19319.668,521.519,10.000,-85.940},
				{19371.820,521.519,10.000,-85.890},
				{19423.972,521.519,10.000,-85.840},
				{19476.124,521.519,10.000,-85.780},
				{19528.276,521.519,10.000,-85.720},
				{19580.428,521.519,10.000,-85.650},
				{19632.580,521.519,10.000,-85.580},
				{19684.732,521.519,10.000,-85.500},
				{19736.883,521.519,10.000,-85.420},
				{19789.035,521.519,10.000,-85.340},
				{19841.187,521.519,10.000,-85.250},
				{19893.339,521.519,10.000,-85.150},
				{19945.491,521.519,10.000,-85.050},
				{19997.643,521.519,10.000,-84.940},
				{20049.795,521.519,10.000,-84.830},
				{20101.947,521.519,10.000,-84.710},
				{20154.099,521.519,10.000,-84.590},
				{20206.250,521.519,10.000,-84.460},
				{20258.402,521.519,10.000,-84.330},
				{20310.554,521.519,10.000,-84.190},
				{20362.706,521.519,10.000,-84.050},
				{20414.858,521.519,10.000,-83.900},
				{20467.010,521.519,10.000,-83.740},
				{20519.162,521.519,10.000,-83.580},
				{20571.314,521.519,10.000,-83.420},
				{20623.466,521.519,10.000,-83.240},
				{20675.617,521.519,10.000,-83.060},
				{20727.769,521.519,10.000,-82.880},
				{20779.921,521.519,10.000,-82.690},
				{20832.073,521.519,10.000,-82.490},
				{20884.225,521.519,10.000,-82.280},
				{20936.377,521.519,10.000,-82.070},
				{20988.529,521.519,10.000,-81.850},
				{21040.681,521.519,10.000,-81.630},
				{21092.833,521.519,10.000,-81.400},
				{21144.985,521.519,10.000,-81.160},
				{21197.136,521.519,10.000,-80.910},
				{21249.288,521.519,10.000,-80.650},
				{21301.440,521.519,10.000,-80.390},
				{21353.592,521.519,10.000,-80.120},
				{21405.744,521.519,10.000,-79.840},
				{21457.896,521.519,10.000,-79.560},
				{21510.048,521.519,10.000,-79.260},
				{21562.200,521.519,10.000,-78.960},
				{21614.352,521.519,10.000,-78.640},
				{21666.503,521.519,10.000,-78.320},
				{21718.655,521.519,10.000,-77.990},
				{21770.807,521.519,10.000,-77.650},
				{21822.959,521.519,10.000,-77.300},
				{21875.111,521.519,10.000,-76.940},
				{21927.263,521.519,10.000,-76.570},
				{21979.415,521.519,10.000,-76.190},
				{22031.567,521.519,10.000,-75.800},
				{22083.719,521.519,10.000,-75.400},
				{22135.870,521.519,10.000,-74.990},
				{22188.022,521.519,10.000,-74.570},
				{22240.174,521.519,10.000,-74.140},
				{22292.326,521.519,10.000,-73.690},
				{22344.478,521.519,10.000,-73.230},
				{22396.630,521.519,10.000,-72.760},
				{22448.782,521.519,10.000,-72.280},
				{22500.934,521.519,10.000,-71.790},
				{22553.086,521.519,10.000,-71.280},
				{22605.237,521.519,10.000,-70.760},
				{22657.389,521.519,10.000,-70.230},
				{22709.541,521.519,10.000,-69.690},
				{22761.693,521.519,10.000,-69.130},
				{22813.845,521.519,10.000,-68.560},
				{22865.997,521.519,10.000,-67.970},
				{22918.149,521.519,10.000,-67.370},
				{22970.301,521.519,10.000,-66.760},
				{23022.453,521.519,10.000,-66.130},
				{23074.605,521.519,10.000,-65.490},
				{23126.756,521.519,10.000,-64.830},
				{23178.908,521.519,10.000,-64.160},
				{23231.060,521.519,10.000,-63.470},
				{23283.212,521.519,10.000,-62.780},
				{23335.364,521.519,10.000,-62.060},
				{23387.516,521.519,10.000,-61.330},
				{23439.668,521.519,10.000,-60.590},
				{23491.820,521.519,10.000,-59.840},
				{23543.972,521.519,10.000,-59.070},
				{23596.123,521.519,10.000,-58.290},
				{23648.275,521.519,10.000,-57.490},
				{23700.427,521.519,10.000,-56.680},
				{23752.579,521.519,10.000,-55.860},
				{23804.731,521.519,10.000,-55.030},
				{23856.883,521.519,10.000,-54.190},
				{23909.035,521.519,10.000,-53.330},
				{23961.187,521.519,10.000,-52.470},
				{24013.339,521.519,10.000,-51.590},
				{24065.490,521.519,10.000,-50.710},
				{24117.642,521.519,10.000,-49.820},
				{24169.794,521.519,10.000,-48.920},
				{24221.946,521.519,10.000,-48.010},
				{24274.098,521.519,10.000,-47.100},
				{24326.250,521.519,10.000,-46.190},
				{24378.402,521.519,10.000,-45.270},
				{24430.554,521.519,10.000,-44.340},
				{24482.706,521.519,10.000,-43.420},
				{24534.857,521.519,10.000,-42.490},
				{24587.009,521.519,10.000,-41.570},
				{24639.161,521.519,10.000,-40.640},
				{24691.313,521.519,10.000,-39.720},
				{24743.465,521.519,10.000,-38.800},
				{24795.617,521.519,10.000,-37.890},
				{24847.769,521.519,10.000,-36.980},
				{24899.921,521.519,10.000,-36.070},
				{24952.073,521.519,10.000,-35.170},
				{25004.225,521.519,10.000,-34.280},
				{25056.376,521.519,10.000,-33.400},
				{25108.528,521.519,10.000,-32.520},
				{25160.680,521.519,10.000,-31.660},
				{25212.832,521.519,10.000,-30.810},
				{25264.984,521.519,10.000,-29.960},
				{25317.136,521.519,10.000,-29.130},
				{25369.288,521.519,10.000,-28.310},
				{25421.440,521.519,10.000,-27.500},
				{25473.592,521.519,10.000,-26.710},
				{25525.743,521.519,10.000,-25.920},
				{25577.895,521.519,10.000,-25.160},
				{25630.047,521.519,10.000,-24.400},
				{25682.199,521.519,10.000,-23.660},
				{25734.351,521.519,10.000,-22.930},
				{25786.503,521.519,10.000,-22.220},
				{25838.655,521.519,10.000,-21.520},
				{25890.807,521.519,10.000,-20.840},
				{25942.959,521.519,10.000,-20.170},
				{25995.110,521.519,10.000,-19.510},
				{26047.262,521.519,10.000,-18.870},
				{26099.414,521.519,10.000,-18.240},
				{26151.566,521.519,10.000,-17.630},
				{26203.718,521.519,10.000,-17.030},
				{26255.870,521.519,10.000,-16.440},
				{26308.022,521.519,10.000,-15.870},
				{26360.174,521.519,10.000,-15.310},
				{26412.326,521.519,10.000,-14.770},
				{26464.477,521.519,10.000,-14.240},
				{26516.629,521.519,10.000,-13.720},
				{26568.781,521.519,10.000,-13.220},
				{26620.933,521.519,10.000,-12.720},
				{26673.085,521.519,10.000,-12.240},
				{26725.237,521.519,10.000,-11.780},
				{26777.389,521.519,10.000,-11.320},
				{26829.541,521.519,10.000,-10.880},
				{26881.693,521.519,10.000,-10.450},
				{26933.844,521.519,10.000,-10.030},
				{26985.996,521.519,10.000,-9.620},
				{27038.148,521.519,10.000,-9.220},
				{27090.300,521.519,10.000,-8.830},
				{27142.452,521.519,10.000,-8.460},
				{27194.604,521.519,10.000,-8.090},
				{27246.756,521.519,10.000,-7.730},
				{27298.908,521.519,10.000,-7.390},
				{27351.060,521.519,10.000,-7.050},
				{27403.212,521.519,10.000,-6.730},
				{27455.363,521.519,10.000,-6.410},
				{27507.515,521.519,10.000,-6.100},
				{27559.667,521.519,10.000,-5.800},
				{27611.819,521.519,10.000,-5.510},
				{27663.971,521.519,10.000,-5.230},
				{27716.123,521.519,10.000,-4.960},
				{27768.275,521.519,10.000,-4.700},
				{27820.427,521.519,10.000,-4.440},
				{27872.579,521.519,10.000,-4.190},
				{27924.730,521.519,10.000,-3.950},
				{27976.882,521.519,10.000,-3.720},
				{28029.034,521.519,10.000,-3.500},
				{28081.186,521.519,10.000,-3.280},
				{28133.338,521.519,10.000,-3.080},
				{28185.490,521.519,10.000,-2.880},
				{28237.642,521.519,10.000,-2.680},
				{28289.794,521.519,10.000,-2.500},
				{28341.946,521.519,10.000,-2.320},
				{28394.097,521.519,10.000,-2.140},
				{28446.249,521.519,10.000,-1.980},
				{28498.401,521.519,10.000,-1.820},
				{28550.553,521.519,10.000,-1.670},
				{28602.705,521.519,10.000,-1.530},
				{28654.857,521.519,10.000,-1.390},
				{28707.009,521.519,10.000,-1.260},
				{28759.161,521.519,10.000,-1.130},
				{28811.313,521.519,10.000,-1.010},
				{28863.464,521.519,10.000,-0.900},
				{28915.616,521.519,10.000,-0.800},
				{28967.768,521.519,10.000,-0.700},
				{29019.920,521.519,10.000,-0.610},
				{29072.072,521.519,10.000,-0.520},
				{29124.224,521.519,10.000,-0.440},
				{29176.376,521.519,10.000,-0.370},
				{29228.528,521.519,10.000,-0.300},
				{29278.072,495.443,10.000,-0.250},
				{29325.009,469.367,10.000,-0.200},
				{29369.338,443.291,10.000,-0.160},
				{29411.059,417.215,10.000,-0.120},
				{29450.173,391.139,10.000,-0.090},
				{29486.680,365.063,10.000,-0.070},
				{29520.578,338.987,10.000,-0.050},
				{29551.869,312.911,10.000,-0.040},
				{29580.553,286.835,10.000,-0.030},
				{29606.629,260.759,10.000,-0.020},
				{29630.097,234.684,10.000,-0.010},
				{29650.958,208.608,10.000,-0.010},
				{29669.211,182.532,10.000,0.000},
				{29684.857,156.456,10.000,0.000},
				{29697.895,130.380,10.000,0.000},
				{29708.325,104.304,10.000,0.000},
				{29716.148,78.228,10.000,0.000},
				{29721.363,52.152,10.000,0.000}		};

}