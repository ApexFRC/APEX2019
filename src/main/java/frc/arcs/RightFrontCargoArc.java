package frc.arcs;

import com.team319.follower.SrxMotionProfile;
import com.team319.follower.SrxTrajectory;

public class RightFrontCargoArc extends SrxTrajectory {
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (2.00,13.50,0.00)
	// (8.00,13.00,0.00)
	// (12.00,12.50,0.00)
	
    public RightFrontCargoArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public RightFrontCargoArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.000,0.000,10.000,0.000},
				{0.522,5.215,10.000,0.000},
				{1.565,10.430,10.000,0.000},
				{3.129,15.646,10.000,0.000},
				{5.215,20.861,10.000,0.000},
				{7.823,26.076,10.000,0.000},
				{10.952,31.291,10.000,0.000},
				{14.603,36.506,10.000,0.000},
				{18.775,41.722,10.000,0.000},
				{23.468,46.937,10.000,0.000},
				{28.684,52.152,10.000,0.000},
				{34.420,57.367,10.000,0.000},
				{40.678,62.582,10.000,0.000},
				{47.458,67.797,10.000,0.000},
				{54.759,73.013,10.000,0.000},
				{62.582,78.228,10.000,0.000},
				{70.927,83.443,10.000,0.000},
				{79.792,88.658,10.000,0.000},
				{89.180,93.873,10.000,0.000},
				{99.089,99.089,10.000,0.010},
				{109.519,104.304,10.000,0.010},
				{120.471,109.519,10.000,0.010},
				{131.944,114.734,10.000,0.010},
				{143.939,119.949,10.000,0.010},
				{156.456,125.165,10.000,0.010},
				{169.494,130.380,10.000,0.020},
				{183.053,135.595,10.000,0.020},
				{197.134,140.810,10.000,0.020},
				{211.737,146.025,10.000,0.030},
				{226.861,151.240,10.000,0.030},
				{242.506,156.456,10.000,0.030},
				{258.673,161.671,10.000,0.040},
				{275.362,166.886,10.000,0.040},
				{292.572,172.101,10.000,0.050},
				{310.304,177.316,10.000,0.050},
				{328.557,182.532,10.000,0.060},
				{347.332,187.747,10.000,0.070},
				{366.628,192.962,10.000,0.070},
				{386.446,198.177,10.000,0.080},
				{406.785,203.392,10.000,0.090},
				{427.646,208.608,10.000,0.100},
				{449.028,213.823,10.000,0.110},
				{470.932,219.038,10.000,0.120},
				{493.357,224.253,10.000,0.130},
				{516.304,229.468,10.000,0.140},
				{539.772,234.684,10.000,0.160},
				{563.762,239.899,10.000,0.170},
				{588.273,245.114,10.000,0.180},
				{613.306,250.329,10.000,0.200},
				{638.861,255.544,10.000,0.220},
				{664.937,260.759,10.000,0.230},
				{691.534,265.975,10.000,0.250},
				{718.653,271.190,10.000,0.270},
				{746.294,276.405,10.000,0.290},
				{774.456,281.620,10.000,0.310},
				{803.139,286.835,10.000,0.330},
				{832.344,292.051,10.000,0.360},
				{862.071,297.266,10.000,0.380},
				{892.319,302.481,10.000,0.410},
				{923.088,307.696,10.000,0.430},
				{954.380,312.911,10.000,0.460},
				{986.192,318.127,10.000,0.490},
				{1018.526,323.342,10.000,0.520},
				{1051.382,328.557,10.000,0.550},
				{1084.759,333.772,10.000,0.590},
				{1118.658,338.987,10.000,0.620},
				{1153.078,344.202,10.000,0.660},
				{1188.020,349.418,10.000,0.690},
				{1223.483,354.633,10.000,0.730},
				{1259.468,359.848,10.000,0.770},
				{1295.975,365.063,10.000,0.810},
				{1333.002,370.278,10.000,0.850},
				{1370.552,375.494,10.000,0.900},
				{1408.623,380.709,10.000,0.940},
				{1447.215,385.924,10.000,0.990},
				{1486.329,391.139,10.000,1.040},
				{1525.964,396.354,10.000,1.090},
				{1566.121,401.570,10.000,1.140},
				{1606.800,406.785,10.000,1.200},
				{1648.000,412.000,10.000,1.250},
				{1689.721,417.215,10.000,1.310},
				{1731.964,422.430,10.000,1.370},
				{1774.729,427.646,10.000,1.430},
				{1818.015,432.861,10.000,1.490},
				{1861.823,438.076,10.000,1.550},
				{1906.152,443.291,10.000,1.610},
				{1951.002,448.506,10.000,1.680},
				{1996.374,453.721,10.000,1.750},
				{2042.268,458.937,10.000,1.820},
				{2088.683,464.152,10.000,1.890},
				{2135.620,469.367,10.000,1.960},
				{2183.078,474.582,10.000,2.040},
				{2231.058,479.797,10.000,2.110},
				{2279.559,485.013,10.000,2.190},
				{2328.582,490.228,10.000,2.270},
				{2378.126,495.443,10.000,2.350},
				{2428.192,500.658,10.000,2.430},
				{2478.779,505.873,10.000,2.510},
				{2529.888,511.089,10.000,2.600},
				{2581.519,516.304,10.000,2.680},
				{2633.671,521.519,10.000,2.770},
				{2686.344,526.734,10.000,2.860},
				{2739.539,531.949,10.000,2.950},
				{2793.255,537.164,10.000,3.040},
				{2847.493,542.380,10.000,3.140},
				{2902.253,547.595,10.000,3.230},
				{2957.534,552.810,10.000,3.330},
				{3013.336,558.025,10.000,3.420},
				{3069.660,563.240,10.000,3.520},
				{3126.506,568.456,10.000,3.620},
				{3183.873,573.671,10.000,3.720},
				{3241.762,578.886,10.000,3.820},
				{3300.172,584.101,10.000,3.930},
				{3359.103,589.316,10.000,4.030},
				{3418.557,594.532,10.000,4.130},
				{3478.531,599.747,10.000,4.240},
				{3539.027,604.962,10.000,4.350},
				{3600.045,610.177,10.000,4.450},
				{3661.584,615.392,10.000,4.560},
				{3723.645,620.608,10.000,4.670},
				{3786.227,625.823,10.000,4.780},
				{3849.331,631.038,10.000,4.880},
				{3912.956,636.253,10.000,4.990},
				{3977.103,641.468,10.000,5.100},
				{4041.772,646.683,10.000,5.210},
				{4106.961,651.899,10.000,5.320},
				{4172.673,657.114,10.000,5.430},
				{4238.906,662.329,10.000,5.540},
				{4305.660,667.544,10.000,5.650},
				{4372.936,672.759,10.000,5.760},
				{4440.734,677.975,10.000,5.870},
				{4509.053,683.190,10.000,5.980},
				{4577.893,688.405,10.000,6.090},
				{4647.255,693.620,10.000,6.200},
				{4717.139,698.835,10.000,6.310},
				{4787.544,704.051,10.000,6.410},
				{4858.470,709.266,10.000,6.520},
				{4929.918,714.481,10.000,6.630},
				{5001.888,719.696,10.000,6.730},
				{5074.379,724.911,10.000,6.830},
				{5147.392,730.126,10.000,6.940},
				{5220.926,735.342,10.000,7.040},
				{5294.982,740.557,10.000,7.140},
				{5369.559,745.772,10.000,7.230},
				{5444.657,750.987,10.000,7.330},
				{5520.278,756.202,10.000,7.420},
				{5596.420,761.418,10.000,7.520},
				{5673.083,766.633,10.000,7.610},
				{5750.268,771.848,10.000,7.700},
				{5827.974,777.063,10.000,7.780},
				{5906.202,782.278,10.000,7.870},
				{5984.951,787.494,10.000,7.950},
				{6064.222,792.709,10.000,8.030},
				{6144.014,797.924,10.000,8.100},
				{6224.328,803.139,10.000,8.180},
				{6305.164,808.354,10.000,8.250},
				{6386.521,813.570,10.000,8.320},
				{6468.399,818.785,10.000,8.380},
				{6550.799,824.000,10.000,8.450},
				{6633.721,829.215,10.000,8.510},
				{6717.164,834.430,10.000,8.560},
				{6801.128,839.645,10.000,8.610},
				{6885.614,844.861,10.000,8.660},
				{6970.622,850.076,10.000,8.710},
				{7056.151,855.291,10.000,8.750},
				{7142.202,860.506,10.000,8.790},
				{7228.774,865.721,10.000,8.820},
				{7315.867,870.937,10.000,8.850},
				{7403.483,876.152,10.000,8.870},
				{7491.619,881.367,10.000,8.890},
				{7580.277,886.582,10.000,8.910},
				{7669.457,891.797,10.000,8.920},
				{7759.158,897.013,10.000,8.930},
				{7849.381,902.228,10.000,8.930},
				{7940.126,907.443,10.000,8.930},
				{8031.391,912.658,10.000,8.930},
				{8123.179,917.873,10.000,8.910},
				{8215.488,923.088,10.000,8.900},
				{8308.318,928.304,10.000,8.880},
				{8401.670,933.519,10.000,8.850},
				{8495.543,938.734,10.000,8.820},
				{8589.938,943.949,10.000,8.780},
				{8684.855,949.164,10.000,8.740},
				{8780.292,954.380,10.000,8.690},
				{8876.252,959.595,10.000,8.640},
				{8972.733,964.810,10.000,8.580},
				{9069.735,970.025,10.000,8.520},
				{9167.260,975.240,10.000,8.450},
				{9265.305,980.456,10.000,8.380},
				{9363.872,985.671,10.000,8.300},
				{9462.961,990.886,10.000,8.210},
				{9562.571,996.101,10.000,8.120},
				{9662.703,1001.316,10.000,8.020},
				{9763.356,1006.532,10.000,7.920},
				{9864.530,1011.747,10.000,7.820},
				{9966.227,1016.962,10.000,7.700},
				{10068.444,1022.177,10.000,7.590},
				{10171.183,1027.392,10.000,7.460},
				{10274.444,1032.607,10.000,7.330},
				{10378.226,1037.823,10.000,7.200},
				{10482.530,1043.038,10.000,7.060},
				{10587.356,1048.253,10.000,6.920},
				{10692.702,1053.468,10.000,6.770},
				{10798.571,1058.683,10.000,6.620},
				{10904.682,1061.118,10.000,6.460},
				{11010.273,1055.903,10.000,6.300},
				{11115.341,1050.687,10.000,6.140},
				{11219.889,1045.472,10.000,5.970},
				{11323.914,1040.257,10.000,5.810},
				{11427.419,1035.042,10.000,5.640},
				{11530.401,1029.827,10.000,5.470},
				{11632.862,1024.611,10.000,5.300},
				{11734.802,1019.396,10.000,5.120},
				{11836.220,1014.181,10.000,4.950},
				{11937.117,1008.966,10.000,4.780},
				{12037.492,1003.751,10.000,4.600},
				{12137.345,998.536,10.000,4.430},
				{12236.677,993.320,10.000,4.250},
				{12335.488,988.105,10.000,4.080},
				{12433.777,982.890,10.000,3.910},
				{12531.544,977.675,10.000,3.740},
				{12628.790,972.460,10.000,3.570},
				{12725.515,967.244,10.000,3.400},
				{12821.718,962.029,10.000,3.230},
				{12917.399,956.814,10.000,3.060},
				{13012.559,951.599,10.000,2.900},
				{13107.197,946.384,10.000,2.740},
				{13201.314,941.168,10.000,2.580},
				{13294.909,935.953,10.000,2.430},
				{13387.983,930.738,10.000,2.280},
				{13480.536,925.523,10.000,2.130},
				{13572.566,920.308,10.000,1.980},
				{13664.076,915.092,10.000,1.840},
				{13755.063,909.877,10.000,1.710},
				{13845.530,904.662,10.000,1.570},
				{13935.474,899.447,10.000,1.440},
				{14024.897,894.232,10.000,1.320},
				{14113.799,889.017,10.000,1.200},
				{14202.179,883.801,10.000,1.080},
				{14290.038,878.586,10.000,0.970},
				{14377.375,873.371,10.000,0.870},
				{14464.190,868.156,10.000,0.770},
				{14550.485,862.941,10.000,0.680},
				{14636.257,857.725,10.000,0.590},
				{14721.508,852.510,10.000,0.500},
				{14806.238,847.295,10.000,0.430},
				{14890.446,842.080,10.000,0.360},
				{14974.132,836.865,10.000,0.290},
				{15057.297,831.649,10.000,0.230},
				{15139.940,826.434,10.000,0.180},
				{15222.062,821.219,10.000,0.130},
				{15303.663,816.004,10.000,0.100},
				{15384.742,810.789,10.000,0.060},
				{15465.299,805.574,10.000,0.040},
				{15545.335,800.358,10.000,0.020},
				{15624.849,795.143,10.000,0.010},
				{15624.849,795.143,10.000,0.010},
				{15703.842,789.928,10.000,0.000},
				{15782.313,784.713,10.000,0.010},
				{15860.263,779.498,10.000,0.030},
				{15937.691,774.282,10.000,0.080},
				{16014.598,769.067,10.000,0.150},
				{16090.983,763.852,10.000,0.240},
				{16166.847,758.637,10.000,0.340},
				{16242.189,753.422,10.000,0.460},
				{16317.010,748.206,10.000,0.590},
				{16391.309,742.991,10.000,0.740},
				{16465.086,737.776,10.000,0.900},
				{16538.342,732.561,10.000,1.070},
				{16611.077,727.346,10.000,1.250},
				{16683.290,722.130,10.000,1.440},
				{16754.981,716.915,10.000,1.640},
				{16826.152,711.700,10.000,1.850},
				{16896.800,706.485,10.000,2.070},
				{16966.927,701.270,10.000,2.290},
				{17036.532,696.055,10.000,2.520},
				{17105.616,690.839,10.000,2.750},
				{17174.179,685.624,10.000,2.980},
				{17242.220,680.409,10.000,3.220},
				{17309.739,675.194,10.000,3.470},
				{17376.737,669.979,10.000,3.710},
				{17443.213,664.763,10.000,3.960},
				{17509.168,659.548,10.000,4.210},
				{17574.601,654.333,10.000,4.450},
				{17639.513,649.118,10.000,4.700},
				{17703.903,643.903,10.000,4.950},
				{17767.772,638.687,10.000,5.200},
				{17831.119,633.472,10.000,5.450},
				{17893.945,628.257,10.000,5.700},
				{17956.249,623.042,10.000,5.940},
				{18018.032,617.827,10.000,6.180},
				{18079.293,612.612,10.000,6.420},
				{18140.033,607.396,10.000,6.660},
				{18200.251,602.181,10.000,6.900},
				{18259.947,596.966,10.000,7.130},
				{18319.123,591.751,10.000,7.360},
				{18377.776,586.536,10.000,7.580},
				{18435.908,581.320,10.000,7.810},
				{18493.519,576.105,10.000,8.020},
				{18550.608,570.890,10.000,8.240},
				{18607.175,565.675,10.000,8.450},
				{18663.221,560.460,10.000,8.650},
				{18718.746,555.244,10.000,8.850},
				{18773.748,550.029,10.000,9.050},
				{18828.230,544.814,10.000,9.240},
				{18882.190,539.599,10.000,9.420},
				{18935.628,534.384,10.000,9.610},
				{18988.545,529.168,10.000,9.780},
				{19040.940,523.953,10.000,9.950},
				{19092.814,518.738,10.000,10.120},
				{19144.166,513.523,10.000,10.280},
				{19194.997,508.308,10.000,10.440},
				{19245.306,503.093,10.000,10.590},
				{19295.094,497.877,10.000,10.740},
				{19344.360,492.662,10.000,10.890},
				{19393.105,487.447,10.000,11.020},
				{19441.328,482.232,10.000,11.160},
				{19489.030,477.017,10.000,11.290},
				{19536.210,471.801,10.000,11.410},
				{19582.869,466.586,10.000,11.530},
				{19629.006,461.371,10.000,11.640},
				{19674.621,456.156,10.000,11.750},
				{19719.715,450.941,10.000,11.860},
				{19764.288,445.725,10.000,11.960},
				{19808.339,440.510,10.000,12.060},
				{19851.868,435.295,10.000,12.150},
				{19894.876,430.080,10.000,12.240},
				{19937.363,424.865,10.000,12.320},
				{19979.328,419.650,10.000,12.400},
				{20020.771,414.434,10.000,12.480},
				{20061.693,409.219,10.000,12.550},
				{20102.094,404.004,10.000,12.620},
				{20141.973,398.789,10.000,12.680},
				{20181.330,393.574,10.000,12.740},
				{20220.166,388.358,10.000,12.800},
				{20258.480,383.143,10.000,12.850},
				{20296.273,377.928,10.000,12.900},
				{20333.544,372.713,10.000,12.950},
				{20370.294,367.498,10.000,13.000},
				{20406.522,362.282,10.000,13.040},
				{20442.229,357.067,10.000,13.080},
				{20477.414,351.852,10.000,13.110},
				{20512.078,346.637,10.000,13.140},
				{20546.220,341.422,10.000,13.180},
				{20579.841,336.206,10.000,13.200},
				{20612.940,330.991,10.000,13.230},
				{20645.517,325.776,10.000,13.250},
				{20677.573,320.561,10.000,13.270},
				{20709.108,315.346,10.000,13.290},
				{20740.121,310.131,10.000,13.300},
				{20770.613,304.915,10.000,13.320},
				{20800.583,299.700,10.000,13.330},
				{20830.031,294.485,10.000,13.340},
				{20858.958,289.270,10.000,13.350},
				{20887.363,284.055,10.000,13.360},
				{20915.247,278.839,10.000,13.360},
				{20942.610,273.624,10.000,13.360},
				{20969.451,268.409,10.000,13.370},
				{20995.770,263.194,10.000,13.370},
				{21021.568,257.979,10.000,13.370},
				{21046.844,252.763,10.000,13.360},
				{21071.599,247.548,10.000,13.360},
				{21095.832,242.333,10.000,13.360},
				{21119.544,237.118,10.000,13.350},
				{21142.735,231.903,10.000,13.350},
				{21165.403,226.688,10.000,13.340},
				{21187.551,221.472,10.000,13.330},
				{21209.176,216.257,10.000,13.320},
				{21230.280,211.042,10.000,13.320},
				{21250.863,205.827,10.000,13.310},
				{21270.924,200.612,10.000,13.300},
				{21290.464,195.396,10.000,13.280},
				{21309.482,190.181,10.000,13.270},
				{21327.979,184.966,10.000,13.260},
				{21345.954,179.751,10.000,13.250},
				{21363.407,174.536,10.000,13.240},
				{21380.339,169.320,10.000,13.230},
				{21396.750,164.105,10.000,13.220},
				{21412.639,158.890,10.000,13.200},
				{21428.006,153.675,10.000,13.190},
				{21442.852,148.460,10.000,13.180},
				{21457.177,143.244,10.000,13.170},
				{21470.980,138.029,10.000,13.150},
				{21484.261,132.814,10.000,13.140},
				{21497.021,127.599,10.000,13.130},
				{21509.259,122.384,10.000,13.120},
				{21520.976,117.169,10.000,13.110},
				{21532.172,111.953,10.000,13.100},
				{21542.845,106.738,10.000,13.080},
				{21552.998,101.523,10.000,13.070},
				{21562.628,96.308,10.000,13.060},
				{21571.738,91.093,10.000,13.050},
				{21580.325,85.877,10.000,13.040},
				{21588.392,80.662,10.000,13.040},
				{21595.936,75.447,10.000,13.030},
				{21602.960,70.232,10.000,13.020},
				{21609.461,65.017,10.000,13.010},
				{21615.441,59.801,10.000,13.010},
				{21620.900,54.586,10.000,13.000},
				{21625.837,49.371,10.000,12.990},
				{21630.253,44.156,10.000,12.990},
				{21634.147,38.941,10.000,12.980},
				{21637.519,33.726,10.000,12.980},
				{21640.370,28.510,10.000,12.980},
				{21642.700,23.295,10.000,12.970},
				{21644.508,18.080,10.000,12.970},
				{21645.794,12.865,10.000,12.970},
				{21646.559,7.650,10.000,12.970},
				{21646.803,2.434,10.000,12.970},
				{21646.525,-2.781,10.000,12.970},
				{21645.725,-7.996,10.000,12.970},
				{21644.404,-13.211,10.000,12.970},
				{21642.561,-18.426,10.000,12.970},
				{21640.197,-23.642,10.000,12.980},
				{21637.311,-28.857,10.000,12.980},
				{21633.904,-34.072,10.000,12.980},
				{21629.976,-39.287,10.000,12.990},
				{21625.525,-44.502,10.000,12.990},
				{21620.554,-49.718,10.000,13.000},
				{21615.060,-54.933,10.000,13.010},
				{21609.045,-60.148,10.000,13.010},
				{21602.509,-65.363,10.000,13.020},
				{21595.451,-70.578,10.000,13.030},
				{21587.872,-75.793,10.000,13.040},
				{21579.771,-81.009,10.000,13.050},
				{21571.149,-86.224,10.000,13.050},
				{21562.005,-91.439,10.000,13.060},
				{21552.339,-96.654,10.000,13.070},
				{21542.152,-101.869,10.000,13.090},
				{21531.444,-107.085,10.000,13.100},
				{21520.214,-112.300,10.000,13.110},
				{21508.463,-117.515,10.000,13.120},
				{21496.190,-122.730,10.000,13.130},
				{21483.395,-127.945,10.000,13.140},
				{21470.079,-133.161,10.000,13.150},
				{21456.241,-138.376,10.000,13.170},
				{21441.882,-143.591,10.000,13.180},
				{21427.002,-148.806,10.000,13.190},
				{21411.600,-154.021,10.000,13.200},
				{21395.676,-159.236,10.000,13.220},
				{21379.231,-164.452,10.000,13.230},
				{21362.264,-169.667,10.000,13.240},
				{21344.776,-174.882,10.000,13.250},
				{21326.766,-180.097,10.000,13.260},
				{21308.235,-185.312,10.000,13.270},
				{21289.182,-190.528,10.000,13.290},
				{21269.608,-195.743,10.000,13.300},
				{21249.512,-200.958,10.000,13.310},
				{21228.895,-206.173,10.000,13.320},
				{21207.756,-211.388,10.000,13.320},
				{21186.095,-216.604,10.000,13.330},
				{21163.914,-221.819,10.000,13.340},
				{21141.210,-227.034,10.000,13.350},
				{21117.985,-232.249,10.000,13.350},
				{21094.239,-237.464,10.000,13.360},
				{21069.971,-242.680,10.000,13.360},
				{21045.181,-247.895,10.000,13.360},
				{21019.870,-253.110,10.000,13.370},
				{20994.038,-258.325,10.000,13.370},
				{20967.684,-263.540,10.000,13.370},
				{20940.808,-268.755,10.000,13.360},
				{20913.411,-273.971,10.000,13.360},
				{20885.493,-279.186,10.000,13.360},
				{20857.053,-284.401,10.000,13.350},
				{20828.091,-289.616,10.000,13.340},
				{20798.608,-294.831,10.000,13.330},
				{20768.603,-300.047,10.000,13.320},
				{20738.077,-305.262,10.000,13.300},
				{20707.029,-310.477,10.000,13.290},
				{20675.460,-315.692,10.000,13.270},
				{20643.369,-320.907,10.000,13.250},
				{20610.757,-326.123,10.000,13.230},
				{20577.623,-331.338,10.000,13.200},
				{20543.968,-336.553,10.000,13.170},
				{20509.791,-341.768,10.000,13.140},
				{20475.093,-346.983,10.000,13.110},
				{20439.873,-352.198,10.000,13.070},
				{20404.132,-357.414,10.000,13.040},
				{20367.869,-362.629,10.000,12.990}		};

}