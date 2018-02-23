package org.usfirst.frc.team3539.robot.profiles;
public class testmotion implements IProfile{
   public static final int kNumPoints = 225;
   public static double PointsL[][] = new double[][] {{	0.00003821656051		,	0.4583312102	,	10	},
	   {	0.0001656050955		,	0.7636433121	,	10	},
	   {	0.0005089171975		,	2.062433121	,	10	},
	   {	0.001120382166		,	3.666535032	,	10	},
	   {	0.002075159236		,	5.728968153	,	10	},
	   {	0.003412101911		,	8.020547771	,	10	},
	   {	0.005130573248		,	10.31212739	,	10	},
	   {	0.007231210191		,	12.60370701	,	10	},
	   {	0.009714012739		,	14.89532484	,	10	},
	   {	0.01257834395		,	17.18690446	,	10	},
	   {	0.01582484076		,	19.47848408	,	10	},
	   {	0.01945286624		,	21.77006369	,	10	},
	   {	0.02346305732		,	24.06164331	,	10	},
	   {	0.02785541401		,	26.35322293	,	10	},
	   {	0.03262929936		,	28.64484076	,	10	},
	   {	0.03778598726		,	30.93642038	,	10	},
	   {	0.04332356688		,	33.228	,	10	},
	   {	0.0492433121		,	35.51957962	,	10	},
	   {	0.05554522293		,	37.81115924	,	10	},
	   {	0.06222929936		,	40.10277707	,	10	},
	   {	0.06929490446		,	42.39435669	,	10	},
	   {	0.07674267516		,	44.68593631	,	10	},
	   {	0.08457197452		,	46.97751592	,	10	},
	   {	0.09278343949		,	49.26909554	,	10	},
	   {	0.1013770701		,	51.56067516	,	10	},
	   {	0.1103528662		,	53.85229299	,	10	},
	   {	0.1197101911		,	56.14387261	,	10	},
	   {	0.1294490446		,	58.43545223	,	10	},
	   {	0.1395700637		,	60.72703185	,	10	},
	   {	0.1500732484		,	63.01861146	,	10	},
	   {	0.1609585987		,	65.31019108	,	10	},
	   {	0.1722254777		,	67.60180892	,	10	},
	   {	0.1838745223		,	69.89338854	,	10	},
	   {	0.1959050955		,	72.18496815	,	10	},
	   {	0.2083178344		,	74.47654777	,	10	},
	   {	0.2211127389		,	76.76812739	,	10	},
	   {	0.234289172		,	79.05970701	,	10	},
	   {	0.2478477707		,	81.35132484	,	10	},
	   {	0.261788535		,	83.64290446	,	10	},
	   {	0.276110828		,	85.93448408	,	10	},
	   {	0.2908152866		,	88.22606369	,	10	},
	   {	0.3059012739		,	90.51764331	,	10	},
	   {	0.3213694268		,	92.80926115	,	10	},
	   {	0.3372197452		,	95.10084076	,	10	},
	   {	0.3534515924		,	97.39242038	,	10	},
	   {	0.3700656051		,	99.684	,	10	},
	   {	0.3870617834		,	101.9755796	,	10	},
	   {	0.4044394904		,	104.2671592	,	10	},
	   {	0.4221993631		,	106.5587771	,	10	},
	   {	0.4403407643		,	108.8503567	,	10	},
	   {	0.4588643312		,	111.1419363	,	10	},
	   {	0.4777700637		,	113.4335159	,	10	},
	   {	0.4970579618		,	115.7250955	,	10	},
	   {	0.5167273885		,	118.0166752	,	10	},
	   {	0.5367783439		,	120.308293	,	10	},
	   {	0.5572121019		,	122.5998726	,	10	},
	   {	0.5780273885		,	124.8914522	,	10	},
	   {	0.5992242038		,	127.1830318	,	10	},
	   {	0.6208031847		,	129.4746115	,	10	},
	   {	0.6427643312		,	131.7661911	,	10	},
	   {	0.6651076433		,	134.0578089	,	10	},
	   {	0.6878324841		,	136.3493885	,	10	},
	   {	0.7109388535		,	138.6409682	,	10	},
	   {	0.7344280255		,	140.9325478	,	10	},
	   {	0.7582987261		,	143.2241274	,	10	},
	   {	0.7825509554		,	145.5157452	,	10	},
	   {	0.8071859873		,	147.8073248	,	10	},
	   {	0.8322025478		,	150.0989045	,	10	},
	   {	0.8576006369		,	152.3904841	,	10	},
	   {	0.8833808917		,	154.6820637	,	10	},
	   {	0.9095433121		,	156.9736433	,	10	},
	   {	0.9360872611		,	159.2652611	,	10	},
	   {	0.9630133758		,	161.5568408	,	10	},
	   {	0.9903216561		,	163.8484204	,	10	},
	   {	1.018011465		,	166.14	,	10	},
	   {	1.046083439		,	168.4315796	,	10	},
	   {	1.07453758		,	170.7231592	,	10	},
	   {	1.103373248		,	173.0147771	,	10	},
	   {	1.132591083		,	175.3063567	,	10	},
	   {	1.162190446		,	177.5979363	,	10	},
	   {	1.192171975		,	179.8895159	,	10	},
	   {	1.222535669		,	182.1810955	,	10	},
	   {	1.253281529		,	184.4726752	,	10	},
	   {	1.28440828		,	186.764293	,	10	},
	   {	1.315917834		,	189.0558726	,	10	},
	   {	1.347808917		,	191.3474522	,	10	},
	   {	1.380082166		,	193.6390318	,	10	},
	   {	1.41273758		,	195.9306115	,	10	},
	   {	1.445774522		,	198.2222293	,	10	},
	   {	1.479193631		,	200.5138089	,	10	},
	   {	1.512994268		,	202.8053885	,	10	},
	   {	1.54717707		,	205.0969682	,	10	},
	   {	1.581742038		,	207.3885478	,	10	},
	   {	1.616688535		,	209.6801274	,	10	},
	   {	1.652017197		,	211.9717452	,	10	},
	   {	1.687728025		,	214.2633248	,	10	},
	   {	1.723820382		,	216.5549045	,	10	},
	   {	1.760294904		,	218.8464841	,	10	},
	   {	1.797150955		,	221.1380637	,	10	},
	   {	1.834389172		,	223.4296433	,	10	},
	   {	1.872009554		,	225.7212611	,	10	},
	   {	1.910011465		,	228.0128408	,	10	},
	   {	1.948395541		,	230.3044204	,	10	},
	   {	1.987161783		,	232.596	,	10	},
	   {	2.026309554		,	234.8875796	,	10	},
	   {	2.06583949		,	237.1791592	,	10	},
	   {	2.105751592		,	239.4707771	,	10	},
	   {	2.146045223		,	241.7623567	,	10	},
	   {	2.186720382		,	244.0539363	,	10	},
	   {	2.227778344		,	246.3455159	,	10	},
	   {	2.269217834		,	248.6370955	,	10	},
	   {	2.31103949		,	250.9287134	,	10	},
	   {	2.353242675		,	253.220293	,	10	},
	   {	2.395828025		,	255.5118726	,	10	},
	   {	2.438794904		,	257.8034522	,	10	},
	   {	2.482144586		,	260.0950318	,	10	},
	   {	2.525875159		,	262.3866115	,	10	},
	   {	2.569988535		,	264.6782293	,	10	},
	   {	2.614483439		,	266.9698089	,	10	},
	   {	2.65936051		,	269.2613885	,	10	},
	   {	2.704619108		,	271.5529682	,	10	},
	   {	2.750259873		,	273.8445478	,	10	},
	   {	2.796282803		,	276.1361274	,	10	},
	   {	2.842687261		,	278.4277452	,	10	},
	   {	2.889473885		,	280.7193248	,	10	},
	   {	2.936642038		,	283.0109045	,	10	},
	   {	2.984192994		,	285.3024841	,	10	},
	   {	3.032124841		,	287.5940637	,	10	},
	   {	3.08043949		,	289.8856433	,	10	},
	   {	3.129135669		,	292.1772611	,	10	},
	   {	3.178213376		,	294.4688408	,	10	},
	   {	3.227673885		,	296.7604204	,	10	},
	   {	3.277515924		,	299.052	,	10	},
	   {	3.32773949		,	301.3435796	,	10	},
	   {	3.378345223		,	303.6351975	,	10	},
	   {	3.429333121		,	305.9267771	,	10	},
	   {	3.480703185		,	308.2183567	,	10	},
	   {	3.532454777		,	310.5099363	,	10	},
	   {	3.584588535		,	312.8015159	,	10	},
	   {	3.637103822		,	315.0930955	,	10	},
	   {	3.690001274		,	317.3847134	,	10	},
	   {	3.743280892		,	319.676293	,	10	},
	   {	3.796942038		,	321.9678726	,	10	},
	   {	3.85098535		,	324.2594522	,	10	},
	   {	3.905410191		,	326.5510318	,	10	},
	   {	3.960217197		,	328.8426115	,	10	},
	   {	4.015406369		,	331.1342293	,	10	},
	   {	4.070977707		,	333.4258089	,	10	},
	   {	4.126930573		,	335.7173885	,	10	},
	   {	4.183264968		,	338.0089682	,	10	},
	   {	4.239982166		,	340.3005478	,	10	},
	   {	4.297080892		,	342.5921274	,	10	},
	   {	4.354561146		,	344.8837452	,	10	},
	   {	4.412423567		,	347.1753248	,	10	},
	   {	4.470668153		,	349.4669045	,	10	},
	   {	4.529294904		,	351.7584841	,	10	},
	   {	4.588303185		,	354.0500637	,	10	},
	   {	4.647693631		,	356.3416815	,	10	},
	   {	4.707465605		,	358.6332611	,	10	},
	   {	4.767619745		,	360.9248408	,	10	},
	   {	4.828117834		,	362.9872739	,	10	},
	   {	4.888882803		,	364.5913758	,	10	},
	   {	4.949838854		,	365.7371847	,	10	},
	   {	5.010909554		,	366.4246242	,	10	},
	   {	5.072015287		,	366.6312994	,	10	},
	   {	5.133074522		,	366.3571338	,	10	},
	   {	5.194012102		,	365.6246369	,	10	},
	   {	5.254750955		,	364.4338471	,	10	},
	   {	5.315215287		,	362.7847261	,	10	},
	   {	5.375331847		,	360.6997834	,	10	},
	   {	5.435066242		,	358.4082038	,	10	},
	   {	5.494419108		,	356.1166242	,	10	},
	   {	5.553389809		,	353.8250446	,	10	},
	   {	5.611978981		,	351.533465	,	10	},
	   {	5.670185987		,	349.2418471	,	10	},
	   {	5.728010828		,	346.9502675	,	10	},
	   {	5.78545414		,	344.6586879	,	10	},
	   {	5.842515287		,	342.3671083	,	10	},
	   {	5.899194268		,	340.0755287	,	10	},
	   {	5.95549172		,	337.783949	,	10	},
	   {	6.011407006		,	335.4923312	,	10	},
	   {	6.066940764		,	333.2007516	,	10	},
	   {	6.122092357		,	330.909172	,	10	},
	   {	6.176861783		,	328.6175924	,	10	},
	   {	6.231249682		,	326.3260127	,	10	},
	   {	6.285255414		,	324.0343949	,	10	},
	   {	6.338878981		,	321.7428153	,	10	},
	   {	6.392940764		,	324.3711592	,	10	},
	   {	6.448015924		,	330.4504586	,	10	},
	   {	6.502983439		,	329.8044841	,	10	},
	   {	6.557843949		,	329.1650064	,	10	},
	   {	6.6126		,	328.5359236	,	10	},
	   {	6.667253503		,	327.9210191	,	10	},
	   {	6.721807643		,	327.3239618	,	10	},
	   {	6.776265605		,	326.7483439	,	10	},
	   {	6.830631847		,	326.1976815	,	10	},
	   {	6.884911465		,	325.6753758	,	10	},
	   {	6.939108917		,	325.1847898	,	10	},
	   {	6.993229936		,	324.7290955	,	10	},
	   {	7.047282166		,	324.311465	,	10	},
	   {	7.101271338		,	323.9348408	,	10	},
	   {	7.155205096		,	323.6021274	,	10	},
	   {	7.209091083		,	323.316	,	10	},
	   {	7.26293758		,	323.0788662	,	10	},
	   {	7.316752866		,	322.8930191	,	10	},
	   {	7.370546497		,	322.7603312	,	10	},
	   {	7.424326752		,	322.6823694	,	10	},
	   {	7.478103185		,	322.660242	,	10	},
	   {	7.531885987		,	322.6946369	,	10	},
	   {	7.585683439		,	322.7855159	,	10	},
	   {	7.639505732		,	322.9322293	,	10	},
	   {	7.693361146		,	323.1333248	,	10	},
	   {	7.747258599		,	323.3864331	,	10	},
	   {	7.801207006		,	323.6880764	,	10	},
	   {	7.855212102		,	324.0336688	,	10	},
	   {	7.909282166		,	324.4172866	,	10	},
	   {	7.963420382		,	324.8315159	,	10	},
	   {	8.017631847		,	325.267414	,	10	},
	   {	8.071917197		,	325.7143949	,	10	},
	   {	8.126277707		,	326.1600764	,	10	},
	   {	8.180708917		,	326.590242	,	10	},
	   {	8.235207643		,	326.9889172	,	10	},
	   {	8.289763694		,	327.338293	,	10	},
	   {	8.344366879		,	327.6189936	,	10	},
	   {	8.399001911		,	327.8101529	,	10	},
	   {	8.453650318		,	327.8896815	,	10	},
	   {	8.508289172		,	327.8348408	,	10	},
	   {	8.562892994		,	327.6223949	,	10	},
	   {	8.61743121		,	327.2293376	,	10	},
	   {	8.671870064		,	326.6334268	,	10	},
	   {	8.726172611		,	325.8139108	,	10	},
	   {	8.780298089		,	324.7519108	,	10	},
	   {	8.834203185		,	323.431414	,	10	},
	   {	8.887843312		,	321.8395414	,	10	},
	   {	8.941170701		,	319.9670828	,	10	},
	   {	8.994138854		,	317.8089936	,	10	},
	   {	9.0467		,	315.3644331	,	10	},
	   {	9.098805732		,	312.6368408	,	10	},
	   {	9.150411465		,	309.6338981	,	10	},
	   {	9.201472611		,	306.3671465	,	10	},
	   {	9.251947771		,	302.8515287	,	10	},
	   {	9.301798726		,	299.1050064	,	10	},
	   {	9.350990446		,	295.147949	,	10	},
	   {	9.399490446		,	291.002293	,	10	},
	   {	9.447272611		,	286.6911592	,	10	},
	   {	9.494312102		,	282.238051	,	10	},
	   {	9.540589809		,	277.6663567	,	10	},
	   {	9.586089809		,	272.9989299	,	10	},
	   {	9.630799363		,	268.2575159	,	10	},
	   {	9.674709554		,	263.4626369	,	10	},
	   {	9.717815287		,	258.633172	,	10	},
	   {	9.760112739		,	253.7862803	,	10	},
	   {	9.801602548		,	248.9373631	,	10	},
	   {	9.842285987		,	244.1000255	,	10	},
	   {	9.882166879		,	239.286	,	10	},
	   {	9.921250955		,	234.505414	,	10	},
	   {	9.959545223		,	229.7667134	,	10	},
	   {	9.997057962		,	225.0768153	,	10	},
	   {	10.03379873		,	220.441414	,	10	},
	   {	10.0697758		,	215.8648662	,	10	},
	   {	10.10500127		,	211.3504968	,	10	},
	   {	10.13948471		,	206.9005605	,	10	},
	   {	10.17323758		,	202.5166624	,	10	},
	   {	10.2062707		,	198.1996051	,	10	},
	   {	10.23859554		,	193.9495032	,	10	},
	   {	10.27022293		,	189.7661274	,	10	},
	   {	10.30116433		,	185.6487134	,	10	},
	   {	10.33143057		,	181.5961911	,	10	},
	   {	10.36103185		,	177.6072229	,	10	},
	   {	10.38997834		,	173.6802038	,	10	},
	   {	10.41828089		,	169.8134522	,	10	},
	   {	10.44594841		,	166.0050573	,	10	},
	   {	10.47299045		,	162.2531083	,	10	},
	   {	10.49941656		,	158.5555796	,	10	},
	   {	10.52523503		,	154.9104076	,	10	},
	   {	10.55045414		,	151.3156051	,	10	},
	   {	10.57508217		,	147.7691465	,	10	},
	   {	10.59912739		,	144.2689299	,	10	},
	   {	10.62259618		,	140.8130828	,	10	},
	   {	10.64549554		,	137.3995796	,	10	},
	   {	10.66783376		,	134.026586	,	10	},
	   {	10.68961592		,	130.6922293	,	10	},
	   {	10.71084841		,	127.3947516	,	10	},
	   {	10.73153694		,	124.1324713	,	10	},
	   {	10.75168726		,	120.9036688	,	10	},
	   {	10.7713051		,	117.7067771	,	10	},
	   {	10.79039554		,	114.5403057	,	10	},
	   {	10.80896242		,	111.4027261	,	10	},
	   {	10.82701146		,	108.2926624	,	10	},
	   {	10.84454586		,	105.2087389	,	10	},
	   {	10.8615707		,	102.1496943	,	10	},
	   {	10.87808981		,	99.1142293	,	10	},
	   {	10.89410701		,	96.10127389	,	10	},
	   {	10.90962484		,	93.10956688	,	10	},
	   {	10.92464841		,	90.13811465	,	10	},
	   {	10.93917898		,	87.18584713	,	10	},
	   {	10.95322102		,	84.2517707	,	10	},
	   {	10.96677707		,	81.33492994	,	10	},
	   {	10.97984904		,	78.43448408	,	10	},
	   {	10.99244076		,	75.54943949	,	10	},
	   {	11.00455414		,	72.67907006	,	10	},
	   {	11.01619108		,	69.82257325	,	10	},
	   {	11.02735414		,	66.97910828	,	10	},
	   {	11.03804586		,	64.14802548	,	10	},
	   {	11.04826688		,	61.32856051	,	10	},
	   {	11.05802038		,	58.52002548	,	10	},
	   {	11.06730764		,	55.72184713	,	10	},
	   {	11.07612994		,	52.93333758	,	10	},
	   {	11.08448854		,	50.15388535	,	10	},
	   {	11.09238599		,	47.38295541	,	10	},
	   {	11.09982229		,	44.61993631	,	10	},
	   {	11.1068		,	41.86429299	,	10	},
	   {	11.11331911		,	39.11549045	,	10	},
	   {	11.11938153		,	36.37307006	,	10	},
	   {	11.12498726		,	33.6364586	,	10	},
	   {	11.13013822		,	30.90519745	,	10	},
	   {	11.13483439		,	28.17882803	,	10	},
	   {	11.13907771		,	25.4568535	,	10	},
	   {	11.14286752		,	22.7388535	,	10	},
	   {	11.14620446		,	20.02436943	,	10	},
	   {	11.14909045		,	17.31294268	,	10	},
	   {	11.1515242		,	14.60419108	,	10	},
	   {	11.15350701		,	11.89765605	,	10	},
	   {	11.15503949		,	9.192955414	,	10	},
	   {	11.15612548		,	6.516152866	,	10	},
	   {	11.15681465		,	4.137019108	,	10	},
	   {	11.15719809		,	2.298764331	,	10	},
	   {	11.15736497		,	1.001006369	,	10	},
	   {	11.1574051		,	0.2436305732	,	10	},
	   {	11.1574051		,	0	,	10	},
};  

//Time for left side: 1323 ms, or 1.323 s
   public static double PointsR[][] = new double[][] {
	   {	0.00003821656051		,	0.4583312102	,	10	},
	   {	0.0001656050955		,	0.7636433121	,	10	},
	   {	0.0005089171975		,	2.062433121	,	10	},
	   {	0.001120382166		,	3.666535032	,	10	},
	   {	0.002075159236		,	5.728968153	,	10	},
	   {	0.003412101911		,	8.020547771	,	10	},
	   {	0.005130573248		,	10.31212739	,	10	},
	   {	0.007231210191		,	12.60370701	,	10	},
	   {	0.009714012739		,	14.89532484	,	10	},
	   {	0.01257834395		,	17.18690446	,	10	},
	   {	0.01582484076		,	19.47848408	,	10	},
	   {	0.01945286624		,	21.77006369	,	10	},
	   {	0.02346305732		,	24.06164331	,	10	},
	   {	0.02785541401		,	26.35322293	,	10	},
	   {	0.03262929936		,	28.64484076	,	10	},
	   {	0.03778598726		,	30.93642038	,	10	},
	   {	0.04332356688		,	33.228	,	10	},
	   {	0.0492433121		,	35.51957962	,	10	},
	   {	0.05554522293		,	37.81115924	,	10	},
	   {	0.06222929936		,	40.10277707	,	10	},
	   {	0.06929490446		,	42.39435669	,	10	},
	   {	0.07674267516		,	44.68593631	,	10	},
	   {	0.08457197452		,	46.97751592	,	10	},
	   {	0.09278343949		,	49.26909554	,	10	},
	   {	0.1013770701		,	51.56067516	,	10	},
	   {	0.1103528662		,	53.85229299	,	10	},
	   {	0.1197101911		,	56.14387261	,	10	},
	   {	0.1294490446		,	58.43545223	,	10	},
	   {	0.1395700637		,	60.72703185	,	10	},
	   {	0.1500732484		,	63.01861146	,	10	},
	   {	0.1609585987		,	65.31019108	,	10	},
	   {	0.1722254777		,	67.60180892	,	10	},
	   {	0.1838745223		,	69.89338854	,	10	},
	   {	0.1959050955		,	72.18496815	,	10	},
	   {	0.2083178344		,	74.47654777	,	10	},
	   {	0.2211127389		,	76.76812739	,	10	},
	   {	0.234289172		,	79.05970701	,	10	},
	   {	0.2478477707		,	81.35132484	,	10	},
	   {	0.261788535		,	83.64290446	,	10	},
	   {	0.276110828		,	85.93448408	,	10	},
	   {	0.2908152866		,	88.22606369	,	10	},
	   {	0.3059012739		,	90.51764331	,	10	},
	   {	0.3213694268		,	92.80926115	,	10	},
	   {	0.3372197452		,	95.10084076	,	10	},
	   {	0.3534515924		,	97.39242038	,	10	},
	   {	0.3700656051		,	99.684	,	10	},
	   {	0.3870617834		,	101.9755796	,	10	},
	   {	0.4044394904		,	104.2671592	,	10	},
	   {	0.4221993631		,	106.5587771	,	10	},
	   {	0.4403407643		,	108.8503567	,	10	},
	   {	0.4588643312		,	111.1419363	,	10	},
	   {	0.4777700637		,	113.4335159	,	10	},
	   {	0.4970579618		,	115.7250955	,	10	},
	   {	0.5167273885		,	118.0166752	,	10	},
	   {	0.5367783439		,	120.308293	,	10	},
	   {	0.5572121019		,	122.5998726	,	10	},
	   {	0.5780273885		,	124.8914522	,	10	},
	   {	0.5992242038		,	127.1830318	,	10	},
	   {	0.6208031847		,	129.4746115	,	10	},
	   {	0.6427643312		,	131.7661911	,	10	},
	   {	0.6651076433		,	134.0578089	,	10	},
	   {	0.6878324841		,	136.3493885	,	10	},
	   {	0.7109388535		,	138.6409682	,	10	},
	   {	0.7344280255		,	140.9325478	,	10	},
	   {	0.7582987261		,	143.2241274	,	10	},
	   {	0.7825509554		,	145.5157452	,	10	},
	   {	0.8071859873		,	147.8073248	,	10	},
	   {	0.8322025478		,	150.0989045	,	10	},
	   {	0.8576006369		,	152.3904841	,	10	},
	   {	0.8833808917		,	154.6820637	,	10	},
	   {	0.9095433121		,	156.9736433	,	10	},
	   {	0.9360872611		,	159.2652611	,	10	},
	   {	0.9630133758		,	161.5568408	,	10	},
	   {	0.9903216561		,	163.8484204	,	10	},
	   {	1.018011465		,	166.14	,	10	},
	   {	1.046083439		,	168.4315796	,	10	},
	   {	1.07453758		,	170.7231592	,	10	},
	   {	1.103373248		,	173.0147771	,	10	},
	   {	1.132591083		,	175.3063567	,	10	},
	   {	1.162190446		,	177.5979363	,	10	},
	   {	1.192171975		,	179.8895159	,	10	},
	   {	1.222535669		,	182.1810955	,	10	},
	   {	1.253281529		,	184.4726752	,	10	},
	   {	1.28440828		,	186.764293	,	10	},
	   {	1.315917834		,	189.0558726	,	10	},
	   {	1.347808917		,	191.3474522	,	10	},
	   {	1.380082166		,	193.6390318	,	10	},
	   {	1.41273758		,	195.9306115	,	10	},
	   {	1.445774522		,	198.2222293	,	10	},
	   {	1.479193631		,	200.5138089	,	10	},
	   {	1.512994268		,	202.8053885	,	10	},
	   {	1.54717707		,	205.0969682	,	10	},
	   {	1.581742038		,	207.3885478	,	10	},
	   {	1.616688535		,	209.6801274	,	10	},
	   {	1.652017197		,	211.9717452	,	10	},
	   {	1.687728025		,	214.2633248	,	10	},
	   {	1.723820382		,	216.5549045	,	10	},
	   {	1.760294904		,	218.8464841	,	10	},
	   {	1.797150955		,	221.1380637	,	10	},
	   {	1.834389172		,	223.4296433	,	10	},
	   {	1.872009554		,	225.7212611	,	10	},
	   {	1.910011465		,	228.0128408	,	10	},
	   {	1.948395541		,	230.3044204	,	10	},
	   {	1.987161783		,	232.596	,	10	},
	   {	2.026309554		,	234.8875796	,	10	},
	   {	2.06583949		,	237.1791592	,	10	},
	   {	2.105751592		,	239.4707771	,	10	},
	   {	2.146045223		,	241.7623567	,	10	},
	   {	2.186720382		,	244.0539363	,	10	},
	   {	2.227778344		,	246.3455159	,	10	},
	   {	2.269217834		,	248.6370955	,	10	},
	   {	2.31103949		,	250.9287134	,	10	},
	   {	2.353242675		,	253.220293	,	10	},
	   {	2.395828025		,	255.5118726	,	10	},
	   {	2.438794904		,	257.8034522	,	10	},
	   {	2.482144586		,	260.0950318	,	10	},
	   {	2.525875159		,	262.3866115	,	10	},
	   {	2.569988535		,	264.6782293	,	10	},
	   {	2.614483439		,	266.9698089	,	10	},
	   {	2.65936051		,	269.2613885	,	10	},
	   {	2.704619108		,	271.5529682	,	10	},
	   {	2.750259873		,	273.8445478	,	10	},
	   {	2.796282803		,	276.1361274	,	10	},
	   {	2.842687261		,	278.4277452	,	10	},
	   {	2.889473885		,	280.7193248	,	10	},
	   {	2.936642038		,	283.0109045	,	10	},
	   {	2.984192994		,	285.3024841	,	10	},
	   {	3.032124841		,	287.5940637	,	10	},
	   {	3.08043949		,	289.8856433	,	10	},
	   {	3.129135669		,	292.1772611	,	10	},
	   {	3.178213376		,	294.4688408	,	10	},
	   {	3.227673885		,	296.7604204	,	10	},
	   {	3.277515924		,	299.052	,	10	},
	   {	3.32773949		,	301.3435796	,	10	},
	   {	3.378345223		,	303.6351975	,	10	},
	   {	3.429333121		,	305.9267771	,	10	},
	   {	3.480703185		,	308.2183567	,	10	},
	   {	3.532454777		,	310.5099363	,	10	},
	   {	3.584588535		,	312.8015159	,	10	},
	   {	3.637103822		,	315.0930955	,	10	},
	   {	3.690001274		,	317.3847134	,	10	},
	   {	3.743280892		,	319.676293	,	10	},
	   {	3.796942038		,	321.9678726	,	10	},
	   {	3.85098535		,	324.2594522	,	10	},
	   {	3.905410191		,	326.5510318	,	10	},
	   {	3.960217197		,	328.8426115	,	10	},
	   {	4.015406369		,	331.1342293	,	10	},
	   {	4.070977707		,	333.4258089	,	10	},
	   {	4.126930573		,	335.7173885	,	10	},
	   {	4.183264968		,	338.0089682	,	10	},
	   {	4.239982166		,	340.3005478	,	10	},
	   {	4.297080892		,	342.5921274	,	10	},
	   {	4.354561146		,	344.8837452	,	10	},
	   {	4.412423567		,	347.1753248	,	10	},
	   {	4.470668153		,	349.4669045	,	10	},
	   {	4.529294904		,	351.7584841	,	10	},
	   {	4.588303185		,	354.0500637	,	10	},
	   {	4.647693631		,	356.3416815	,	10	},
	   {	4.707465605		,	358.6332611	,	10	},
	   {	4.767619745		,	360.9248408	,	10	},
	   {	4.828117834		,	362.9872739	,	10	},
	   {	4.888882803		,	364.5913758	,	10	},
	   {	4.949838854		,	365.7371847	,	10	},
	   {	5.010909554		,	366.4246242	,	10	},
	   {	5.072015287		,	366.6312994	,	10	},
	   {	5.133074522		,	366.3571338	,	10	},
	   {	5.194012102		,	365.6246369	,	10	},
	   {	5.254750955		,	364.4338471	,	10	},
	   {	5.315215287		,	362.7847261	,	10	},
	   {	5.375331847		,	360.6997834	,	10	},
	   {	5.435066242		,	358.4082038	,	10	},
	   {	5.494419108		,	356.1166242	,	10	},
	   {	5.553389809		,	353.8250446	,	10	},
	   {	5.611978981		,	351.533465	,	10	},
	   {	5.670185987		,	349.2418471	,	10	},
	   {	5.728010828		,	346.9502675	,	10	},
	   {	5.78545414		,	344.6586879	,	10	},
	   {	5.842515287		,	342.3671083	,	10	},
	   {	5.899194268		,	340.0755287	,	10	},
	   {	5.95549172		,	337.783949	,	10	},
	   {	6.011407006		,	335.4923312	,	10	},
	   {	6.066940764		,	333.2007516	,	10	},
	   {	6.122092357		,	330.909172	,	10	},
	   {	6.176861783		,	328.6175924	,	10	},
	   {	6.231249682		,	326.3260127	,	10	},
	   {	6.285255414		,	324.0343949	,	10	},
	   {	6.338878981		,	321.7428153	,	10	},
	   {	6.391221019		,	314.0535669	,	10	},
	   {	6.441866242		,	303.868586	,	10	},
	   {	6.491854777		,	299.9313248	,	10	},
	   {	6.541185987		,	295.9875287	,	10	},
	   {	6.589857962		,	292.0333376	,	10	},
	   {	6.63786879		,	288.0650064	,	10	},
	   {	6.685215287		,	284.0787898	,	10	},
	   {	6.731893631		,	280.0711338	,	10	},
	   {	6.7779		,	276.0384841	,	10	},
	   {	6.823229936		,	271.9774777	,	10	},
	   {	6.86787707		,	267.8847898	,	10	},
	   {	6.911836943		,	263.7571338	,	10	},
	   {	6.955101911		,	259.5914522	,	10	},
	   {	6.997666242		,	255.3847261	,	10	},
	   {	7.039521656		,	251.1340892	,	10	},
	   {	7.080661146		,	246.8368662	,	10	},
	   {	7.121076433		,	242.4906115	,	10	},
	   {	7.160758599		,	238.0930701	,	10	},
	   {	7.199698726		,	233.6423312	,	10	},
	   {	7.237888535		,	229.1369045	,	10	},
	   {	7.275317834		,	224.5755669	,	10	},
	   {	7.311977707		,	219.9577452	,	10	},
	   {	7.347857962		,	215.2834013	,	10	},
	   {	7.382950318		,	210.5531847	,	10	},
	   {	7.417245223		,	205.7685478	,	10	},
	   {	7.450733758		,	200.9319363	,	10	},
	   {	7.48340828		,	196.0467516	,	10	},
	   {	7.515261146		,	191.1175796	,	10	},
	   {	7.546285987		,	186.1504204	,	10	},
	   {	7.576478344		,	181.1526115	,	10	},
	   {	7.605833758		,	176.1330573	,	10	},
	   {	7.634350955		,	171.1024586	,	10	},
	   {	7.662029299		,	166.0731592	,	10	},
	   {	7.688872611		,	161.0593758	,	10	},
	   {	7.71488535		,	156.0770828	,	10	},
	   {	7.740076433		,	151.144051	,	10	},
	   {	7.764456051		,	146.2797325	,	10	},
	   {	7.788040127		,	141.5049936	,	10	},
	   {	7.810847134		,	136.8418471	,	10	},
	   {	7.832899363		,	132.3131465	,	10	},
	   {	7.854223567		,	127.9420892	,	10	},
	   {	7.874848408		,	123.7516433	,	10	},
	   {	7.894809554		,	119.7641274	,	10	},
	   {	7.914142675		,	116.0002548	,	10	},
	   {	7.932889172		,	112.4789045	,	10	},
	   {	7.95109172		,	109.2161656	,	10	},
	   {	7.968796178		,	106.2248408	,	10	},
	   {	7.986048408		,	103.5141401	,	10	},
	   {	8.002896815		,	101.0891847	,	10	},
	   {	8.019388535		,	98.95073885	,	10	},
	   {	8.035570701		,	97.09536306	,	10	},
	   {	8.051489809		,	95.51541401	,	10	},
	   {	8.067189809		,	94.19935032	,	10	},
	   {	8.082712102		,	93.13219108	,	10	},
	   {	8.098094904		,	92.29589809	,	10	},
	   {	8.113373248		,	91.67025478	,	10	},
	   {	8.128578344		,	91.23321019	,	10	},
	   {	8.143738854		,	90.96164331	,	10	},
	   {	8.158877707		,	90.83208917	,	10	},
	   {	8.17401465		,	90.8210828	,	10	},
	   {	8.189165605		,	90.90584713	,	10	},
	   {	8.204342675		,	91.06452229	,	10	},
	   {	8.219555414		,	91.27670064	,	10	},
	   {	8.234809554		,	91.52346497	,	10	},
	   {	8.250107643		,	91.78761783	,	10	},
	   {	8.265449682		,	92.05375796	,	10	},
	   {	8.280834395		,	92.30835669	,	10	},
	   {	8.296257962		,	92.53952866	,	10	},
	   {	8.311714013		,	92.73729936	,	10	},
	   {	8.327196178		,	92.89318471	,	10	},
	   {	8.342696178		,	93.00019108	,	10	},
	   {	8.358205096		,	93.05270064	,	10	},
	   {	8.373712739		,	93.04631847	,	10	},
	   {	8.389208917		,	92.97779618	,	10	},
	   {	8.404682803		,	92.84476433	,	10	},
	   {	8.420124204		,	92.64569427	,	10	},
	   {	8.435520382		,	92.37978344	,	10	},
	   {	8.450861783		,	92.04687898	,	10	},
	   {	8.466136306		,	91.64724841	,	10	},
	   {	8.481333121		,	91.18161783	,	10	},
	   {	8.496442038		,	90.65109554	,	10	},
	   {	8.511451592		,	90.05701911	,	10	},
	   {	8.526351592		,	89.40095541	,	10	},
	   {	8.541132484		,	88.68466242	,	10	},
	   {	8.555784076		,	87.90997452	,	10	},
	   {	8.570296815		,	87.07884076	,	10	},
	   {	8.58466242		,	86.19328662	,	10	},
	   {	8.598871975		,	85.25533758	,	10	},
	   {	8.612916561		,	84.26701911	,	10	},
	   {	8.626787898		,	83.2303949	,	10	},
	   {	8.640478981		,	82.14749045	,	10	},
	   {	8.653982803		,	81.02021656	,	10	},
	   {	8.667291083		,	79.85059873	,	10	},
	   {	8.680398089		,	78.64047134	,	10	},
	   {	8.693296178		,	77.39166879	,	10	},
	   {	8.705980892		,	76.10598726	,	10	},
	   {	8.718445223		,	74.7851465	,	10	},
	   {	8.730683439		,	73.43078981	,	10	},
	   {	8.742691083		,	72.04452229	,	10	},
	   {	8.75446242		,	70.62787261	,	10	},
	   {	8.765992357		,	69.18229299	,	10	},
	   {	8.777277707		,	67.70923567	,	10	},
	   {	8.788312739		,	66.21	,	10	},
	   {	8.799093631		,	64.68588535	,	10	},
	   {	8.809616561		,	63.13815287	,	10	},
	   {	8.819877707		,	61.56798726	,	10	},
	   {	8.829873885		,	59.97653503	,	10	},
	   {	8.839601274		,	58.36482803	,	10	},
	   {	8.849056688		,	56.73393631	,	10	},
	   {	8.85823758		,	55.08481529	,	10	},
	   {	8.867140764		,	53.41849682	,	10	},
	   {	8.875763694		,	51.73582166	,	10	},
	   {	8.884103185		,	50.03766879	,	10	},
	   {	8.892157325		,	48.32484076	,	10	},
	   {	8.899923567		,	46.59821656	,	10	},
	   {	8.9074		,	44.85848408	,	10	},
	   {	8.914584713		,	43.10644586	,	10	},
	   {	8.921475159		,	41.34271338	,	10	},
	   {	8.928069427		,	39.56805096	,	10	},
	   {	8.934366879		,	37.78310828	,	10	},
	   {	8.940364968		,	35.98842038	,	10	},
	   {	8.94606242		,	34.18471338	,	10	},
	   {	8.951457962		,	32.37248408	,	10	},
	   {	8.956549682		,	30.55230573	,	10	},
	   {	8.961336943		,	28.72478981	,	10	},
	   {	8.965819108		,	26.8903949	,	10	},
	   {	8.969993631		,	25.04969427	,	10	},
	   {	8.973861146		,	23.20310828	,	10	},
	   {	8.977419745		,	21.35121019	,	10	},
	   {	8.98066879		,	19.49442038	,	10	},
	   {	8.983607643		,	17.63319745	,	10	},
	   {	8.986235669		,	15.76803822	,	10	},
	   {	8.988552229		,	13.89936306	,	10	},
	   {	8.990556688		,	12.02759236	,	10	},
	   {	8.992249045		,	10.15318471	,	10	},
	   {	8.993628025		,	8.276522293	,	10	},
	   {	8.994694904		,	6.398063694	,	10	},
	   {	8.995450955		,	4.536726115	,	10	},
	   {	8.99593121		,	2.880993631	,	10	},
	   {	8.996198089		,	1.601082803	,	10	},
	   {	8.996314013		,	0.6972611465	,	10	},
	   {	8.996342038		,	0.1696815287	,	10	},
	   {	8.996342038		,	0	,	10	}};
}
//Time for right side: 1317 ms, or 1.317 s
