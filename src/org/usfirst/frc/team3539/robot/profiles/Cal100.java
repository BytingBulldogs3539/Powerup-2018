package org.usfirst.frc.team3539.robot.profiles;
public class Cal100 implements IProfile
{
  public static final int kNumPoints = 197;
  public static double PointsR[][] = new double[][] {
      {0,0.580703519828083,10},
      {9.67839199713472E-05,0.937534293746441,10},
      {0.000253039638708081,1.36344702313943,10},
      {0.00048028079117982,1.96467804010928,10},
      {0.000807727136177758,2.65334551757849,10},
      {0.00124995138412778,3.47106413094841,10},
      {0.00182846208257863,4.43686220163117,10},
      {0.00256793924067692,5.53367369825808,10},
      {0.00349021820034605,6.7769655632898,10},
      {0.00461971218202982,8.16745678916808,10},
      {0.00598095503998118,9.70731200207398,10},
      {0.00759884041349797,11.4003919619541,10},
      {0.0094989058201659,13.2483497777603,10},
      {0.0117069641562971,15.2534973161471,10},
      {0.014249213748826,17.4175440963776,10},
      {0.0171521387608338,19.742102114804,10},
      {0.0204424892726523,22.2286380395189,10},
      {0.0241472623589143,24.8784655614997,10},
      {0.0282936732061554,27.6927415701806,10},
      {0.0329091302141944,30.6726650237025,10},
      {0.038021238979913,33.8190103687115,10},
      {0.0436577405486805,37.13254057857,10},
      {0.0498464974711266,40.6180553102695,10},
      {0.0566161730374692,44.2066077779583,10},
      {0.0639839413191646,47.8173725227842,10},
      {0.0719535032469441,51.4468234222402,10},
      {0.0805279741360198,55.0955685603594,10},
      {0.0897105688960797,58.7598485245343,10},
      {0.0995038769835021,62.4386115970972,10},
      {0.109910312568387,66.1301406099293,10},
      {0.120932002988744,69.8332423415314,10},
      {0.132570876393631,73.5467618146834,10},
      {0.144828677678267,77.2696970292802,10},
      {0.15770696051648,81.0013825348704,10},
      {0.171207190938959,84.7409999038872,10},
      {0.185330691560345,88.4878913347351,10},
      {0.200078673449467,92.2414678655203,10},
      {0.215452252064459,96.001362351166,10},
      {0.231452479122986,99.7668940435094,10},
      {0.248080294796904,103.537971156281,10},
      {0.265336623322951,107.313828803905,10},
      {0.283222245521819,111.094658207776,10},
      {0.301738021889782,114.879694482316,10},
      {0.320884637636835,118.668746406132,10},
      {0.340662762037857,122.461813979224,10},
      {0.361073064367727,126.258514758803,10},
      {0.382116150160861,130.058665172332,10},
      {0.403792593081441,133.862043402993,10},
      {0.426102934923415,137.668511771382,10},
      {0.449047685610503,141.477825514116,10},
      {0.472627323196189,145.290015226616,10},
      {0.496842325733958,149.104683168384,10},
      {0.521693107536832,152.921859934842,10},
      {0.547180082917829,156.741499632856,10},
      {0.573303666189972,160.563250415061,10},
      {0.600064207925815,164.387295853994,10},
      {0.627462090568148,168.213635949657,10},
      {0.655497696559757,172.041888259261,10},
      {0.684171344602967,175.871670340017,10},
      {0.713483289659637,179.703364634714,10},
      {0.743433850432089,183.536971143352,10},
      {0.774023345622648,187.372489865931,10},
      {0.805252093933637,191.209155916875,10},
      {0.837120286586449,195.047734181759,10},
      {0.869628242283409,198.887459775008,10},
      {0.90277615224591,202.728715139409,10},
      {0.936564271435812,206.571500274964,10},
      {0.970992854814972,210.415432738882,10},
      {1.00606209360479,214.260894973954,10},
      {1.04177224276711,218.10750453739,10},
      {1.07812355726381,221.95526142919,10},
      {1.11511610083534,225.804165649355,10},
      {1.15275012844357,229.653834755096,10},
      {1.19102576756941,233.50503363199,10},
      {1.22994327317475,237.356997394461,10},
      {1.26950277274049,241.210490928084,10},
      {1.3097045212285,245.064749347283,10},
      {1.35054864611972,248.919772652059,10},
      {1.39203527489506,252.775560842411,10},
      {1.43416453503546,256.632878803915,10},
      {1.47693668150278,260.49019676542,10},
      {1.52035171429702,264.349044498078,10},
      {1.56440988838003,268.208657116311,10},
      {1.60911133123275,272.069034620121,10},
      {1.6544561703361,275.930177009508,10},
      {1.70044453317102,279.610041517301,10},
      {1.74704620675724,283.019136531068,10},
      {1.79421606284575,286.24924831997,10},
      {1.84192427089908,289.299611998431,10},
      {1.89014087289882,292.169462680876,10},
      {1.93883578334563,294.858035481726,10},
      {1.98797878925925,297.366095286559,10},
      {2.03753980514034,299.692112324223,10},
      {2.08748849052771,301.836086594716,10},
      {2.13779450496017,303.798018098039,10},
      {2.18842738049558,305.57637706304,10},
      {2.23935677667275,307.171928375294,10},
      {2.29055209806863,308.583907149226,10},
      {2.34198274926017,309.810783613682,10},
      {2.39361787986245,310.854087539816,10},
      {2.44542689445242,311.713818927627,10},
      {2.49737919760702,312.38691823481,10},
      {2.54944368397949,312.876445003671,10},
      {2.60158975814677,313.176280149598,10},
      {2.65378580483837,313.287953443744,10},
      {2.70600046374566,313.283364130286,10},
      {2.75821435776738,313.165571751529,10},
      {2.81040861972596,312.855028207533,10},
      {2.86255112442722,312.354793040604,10},
      {2.91461025660065,311.666396021894,10},
      {2.96655465593764,310.791366922556,10},
      {3.0183532170914,309.728175971437,10},
      {3.0699745797533,308.475293397385,10},
      {3.12138712865287,307.034248971552,10},
      {3.17255950348146,305.405042693939,10},
      {3.22346034393045,303.584615022239,10},
      {3.27405777976749,301.576025498759,10},
      {3.32432045068395,299.37468481004,10},
      {3.37421623148562,296.983652498387,10},
      {3.42371350690202,294.401398792648,10},
      {3.47278040670079,291.627923692824,10},
      {3.5213850606496,288.66169742776,10},
      {3.56949534355422,285.502719997458,10},
      {3.61707913022047,282.155580715375,10},
      {3.6641050603397,278.586624616152,10},
      {3.71053616444239,274.733131082529,10},
      {3.75632501962281,270.748077229775,10},
      {3.8014496991611,266.778321088547,10},
      {3.84591275267586,262.802445862709,10},
      {3.88971316031965,258.826570636871,10},
      {3.93285092209246,254.84916563988,10},
      {3.97532578303244,250.871760642889,10},
      {4.01713774313959,246.892825874746,10},
      {4.05828654745205,242.91236133545,10},
      {4.09877194100795,238.931896796154,10},
      {4.13859392380731,234.949902485705,10},
      {4.17775224088826,230.966378404103,10},
      {4.21624663728895,226.982854322502,10},
      {4.25407711300936,222.996270698595,10},
      {4.2912431581258,219.01121684584,10},
      {4.3277450276001,215.021573679628,10},
      {4.36358195654671,211.031930513416,10},
      {4.39875394496561,207.042287347204,10},
      {4.43326099285681,203.049584638686,10},
      {4.46710259029659,199.053822387863,10},
      {4.50027822736124,195.05806013704,10},
      {4.53278790405074,191.062297886217,10},
      {4.56463162036511,187.063476093088,10},
      {4.59580886638063,183.061594757654,10},
      {4.62631913217357,179.059713422221,10},
      {4.65616241774394,175.054772544481,10},
      {4.68533821316802,171.046772124437,10},
      {4.71384600852209,167.038771704392,10},
      {4.74168580380616,163.027711742042,10},
      {4.7688570890965,159.013592237387,10},
      {4.7953593544694,154.996413190426,10},
      {4.82119209000113,150.97617460116,10},
      {4.84635478576799,146.955936011894,10},
      {4.87084744176998,142.929578338017,10},
      {4.89466903815965,138.90322066414,10},
      {4.917819574937,134.870743905653,10},
      {4.94029803225461,130.83520760486,10},
      {4.96210390018875,126.796611761761,10},
      {4.98323666881571,122.754956376358,10},
      {5.00369582821177,118.707181906343,10},
      {5.0234803585295,114.653288351718,10},
      {5.04258923992145,110.596335254787,10},
      {5.06102196246392,106.533263073246,10},
      {5.07877750630946,102.467131349399,10},
      {5.09585536153436,98.3918209986363,10},
      {5.11225399836746,94.3073320209573,10},
      {5.12797188703762,90.2197835009729,10},
      {5.14300851762112,86.119996811767,10},
      {5.15736185042308,82.0140910379504,10},
      {5.17103086559607,77.8959470949122,10},
      {5.18401352344522,73.7655649826525,10},
      {5.19630778427566,69.6229447011713,10},
      {5.20791160839253,65.4680862504686,10},
      {5.21882295610094,61.2918110036283,10},
      {5.22903825793488,57.100238045261,10},
      {5.23855496427575,52.8841887484508,10},
      {5.24736899573383,48.6406035708921,10},
      {5.25547576299564,44.3633634279743,10},
      {5.26286965690031,40.0616469466135,10},
      {5.26954659805808,35.8639549036355,10},
      {5.27552392387535,31.8712521951178,10},
      {5.2808357992412,28.0835388210604,10},
      {5.28551638904471,24.5008147814633,10},
      {5.28959985817495,21.1291991609373,10},
      {5.29312139136844,17.9625728748715,10},
      {5.29611515351426,15.0070550078768,10},
      {5.2986163293489,12.2657051022586,10},
      {5.30066061353261,9.73240407340596,10},
      {5.30228268087818,7.41633054823516,10},
      {5.30351873596955,5.31136544213541,10},
      {5.30440396354324,3.41138967049596,10},
      {5.30497252848832,1.65827192951463,10},
  }; 
  public static double PointsL[][] = new double[][] {
      {0,0.580703519828083,10},
      {9.67839199713472E-05,0.937534293746441,10},
      {0.000253039638708081,1.36344702313943,10},
      {0.00048028079117982,1.96467804010928,10},
      {0.000807727136177758,2.65334551757849,10},
      {0.00124995138412778,3.47106413094841,10},
      {0.00182846208257863,4.43686220163117,10},
      {0.00256793924067692,5.53367369825808,10},
      {0.00349021820034605,6.7769655632898,10},
      {0.00461971218202982,8.16745678916808,10},
      {0.00598095503998118,9.70731200207398,10},
      {0.00759884041349797,11.4003919619541,10},
      {0.0094989058201659,13.2483497777603,10},
      {0.0117069641562971,15.2534973161471,10},
      {0.014249213748826,17.4175440963776,10},
      {0.0171521387608338,19.742102114804,10},
      {0.0204424892726523,22.2286380395189,10},
      {0.0241472623589143,24.8784655614997,10},
      {0.0282936732061554,27.6927415701806,10},
      {0.0329091302141944,30.6726650237025,10},
      {0.038021238979913,33.8190103687115,10},
      {0.0436577405486805,37.13254057857,10},
      {0.0498464974711266,40.6180553102695,10},
      {0.0566161730374692,44.2066077779583,10},
      {0.0639839413191646,47.8173725227842,10},
      {0.0719535032469441,51.4468234222402,10},
      {0.0805279741360198,55.0955685603594,10},
      {0.0897105688960797,58.7598485245343,10},
      {0.0995038769835021,62.4386115970972,10},
      {0.109910312568387,66.1301406099293,10},
      {0.120932002988744,69.8332423415314,10},
      {0.132570876393631,73.5467618146834,10},
      {0.144828677678267,77.2696970292802,10},
      {0.15770696051648,81.0013825348704,10},
      {0.171207190938959,84.7409999038872,10},
      {0.185330691560345,88.4878913347351,10},
      {0.200078673449467,92.2414678655203,10},
      {0.215452252064459,96.001362351166,10},
      {0.231452479122986,99.7668940435094,10},
      {0.248080294796904,103.537971156281,10},
      {0.265336623322951,107.313828803905,10},
      {0.283222245521819,111.094658207776,10},
      {0.301738021889782,114.879694482316,10},
      {0.320884637636835,118.668746406132,10},
      {0.340662762037857,122.461813979224,10},
      {0.361073064367727,126.258514758803,10},
      {0.382116150160861,130.058665172332,10},
      {0.403792593081441,133.862043402993,10},
      {0.426102934923415,137.668511771382,10},
      {0.449047685610503,141.477825514116,10},
      {0.472627323196189,145.290015226616,10},
      {0.496842325733958,149.104683168384,10},
      {0.521693107536832,152.921859934842,10},
      {0.547180082917829,156.741499632856,10},
      {0.573303666189972,160.563250415061,10},
      {0.600064207925815,164.387295853994,10},
      {0.627462090568148,168.213635949657,10},
      {0.655497696559757,172.041888259261,10},
      {0.684171344602967,175.871670340017,10},
      {0.713483289659637,179.703364634714,10},
      {0.743433850432089,183.536971143352,10},
      {0.774023345622648,187.372489865931,10},
      {0.805252093933637,191.209155916875,10},
      {0.837120286586449,195.047734181759,10},
      {0.869628242283409,198.887459775008,10},
      {0.90277615224591,202.728715139409,10},
      {0.936564271435812,206.571500274964,10},
      {0.970992854814972,210.415432738882,10},
      {1.00606209360479,214.260894973954,10},
      {1.04177224276711,218.10750453739,10},
      {1.07812355726381,221.95526142919,10},
      {1.11511610083534,225.804165649355,10},
      {1.15275012844357,229.653834755096,10},
      {1.19102576756941,233.50503363199,10},
      {1.22994327317475,237.356997394461,10},
      {1.26950277274049,241.210490928084,10},
      {1.3097045212285,245.064749347283,10},
      {1.35054864611972,248.919772652059,10},
      {1.39203527489506,252.775560842411,10},
      {1.43416453503546,256.632878803915,10},
      {1.47693668150278,260.49019676542,10},
      {1.52035171429702,264.349044498078,10},
      {1.56440988838003,268.208657116311,10},
      {1.60911133123275,272.069034620121,10},
      {1.6544561703361,275.930177009508,10},
      {1.70044453317102,279.610041517301,10},
      {1.74704620675724,283.019136531068,10},
      {1.79421606284575,286.24924831997,10},
      {1.84192427089908,289.299611998431,10},
      {1.89014087289882,292.169462680876,10},
      {1.93883578334563,294.858035481726,10},
      {1.98797878925925,297.366095286559,10},
      {2.03753980514034,299.692112324223,10},
      {2.08748849052771,301.836086594716,10},
      {2.13779450496017,303.798018098039,10},
      {2.18842738049558,305.57637706304,10},
      {2.23935677667275,307.171928375294,10},
      {2.29055209806863,308.583907149226,10},
      {2.34198274926017,309.810783613682,10},
      {2.39361787986245,310.854087539816,10},
      {2.44542689445242,311.713818927627,10},
      {2.49737919760702,312.38691823481,10},
      {2.54944368397949,312.876445003671,10},
      {2.60158975814677,313.176280149598,10},
      {2.65378580483837,313.287953443744,10},
      {2.70600046374566,313.283364130286,10},
      {2.75821435776738,313.165571751529,10},
      {2.81040861972596,312.855028207533,10},
      {2.86255112442722,312.354793040604,10},
      {2.91461025660065,311.666396021894,10},
      {2.96655465593764,310.791366922556,10},
      {3.0183532170914,309.728175971437,10},
      {3.0699745797533,308.475293397385,10},
      {3.12138712865287,307.034248971552,10},
      {3.17255950348146,305.405042693939,10},
      {3.22346034393045,303.584615022239,10},
      {3.27405777976749,301.576025498759,10},
      {3.32432045068395,299.37468481004,10},
      {3.37421623148562,296.983652498387,10},
      {3.42371350690202,294.401398792648,10},
      {3.47278040670079,291.627923692824,10},
      {3.5213850606496,288.66169742776,10},
      {3.56949534355422,285.502719997458,10},
      {3.61707913022047,282.155580715375,10},
      {3.6641050603397,278.586624616152,10},
      {3.71053616444239,274.733131082529,10},
      {3.75632501962281,270.748077229775,10},
      {3.8014496991611,266.778321088547,10},
      {3.84591275267586,262.802445862709,10},
      {3.88971316031965,258.826570636871,10},
      {3.93285092209246,254.84916563988,10},
      {3.97532578303244,250.871760642889,10},
      {4.01713774313959,246.892825874746,10},
      {4.05828654745205,242.91236133545,10},
      {4.09877194100795,238.931896796154,10},
      {4.13859392380731,234.949902485705,10},
      {4.17775224088826,230.966378404103,10},
      {4.21624663728895,226.982854322502,10},
      {4.25407711300936,222.996270698595,10},
      {4.2912431581258,219.01121684584,10},
      {4.3277450276001,215.021573679628,10},
      {4.36358195654671,211.031930513416,10},
      {4.39875394496561,207.042287347204,10},
      {4.43326099285681,203.049584638686,10},
      {4.46710259029659,199.053822387863,10},
      {4.50027822736124,195.05806013704,10},
      {4.53278790405074,191.062297886217,10},
      {4.56463162036511,187.063476093088,10},
      {4.59580886638063,183.061594757654,10},
      {4.62631913217357,179.059713422221,10},
      {4.65616241774394,175.054772544481,10},
      {4.68533821316802,171.046772124437,10},
      {4.71384600852209,167.038771704392,10},
      {4.74168580380616,163.027711742042,10},
      {4.7688570890965,159.013592237387,10},
      {4.7953593544694,154.996413190426,10},
      {4.82119209000113,150.97617460116,10},
      {4.84635478576799,146.955936011894,10},
      {4.87084744176998,142.929578338017,10},
      {4.89466903815965,138.90322066414,10},
      {4.917819574937,134.870743905653,10},
      {4.94029803225461,130.83520760486,10},
      {4.96210390018875,126.796611761761,10},
      {4.98323666881571,122.754956376358,10},
      {5.00369582821177,118.707181906343,10},
      {5.0234803585295,114.653288351718,10},
      {5.04258923992145,110.596335254787,10},
      {5.06102196246392,106.533263073246,10},
      {5.07877750630946,102.467131349399,10},
      {5.09585536153436,98.3918209986363,10},
      {5.11225399836746,94.3073320209573,10},
      {5.12797188703762,90.2197835009729,10},
      {5.14300851762112,86.119996811767,10},
      {5.15736185042308,82.0140910379504,10},
      {5.17103086559607,77.8959470949122,10},
      {5.18401352344522,73.7655649826525,10},
      {5.19630778427566,69.6229447011713,10},
      {5.20791160839253,65.4680862504686,10},
      {5.21882295610094,61.2918110036283,10},
      {5.22903825793488,57.100238045261,10},
      {5.23855496427575,52.8841887484508,10},
      {5.24736899573383,48.6406035708921,10},
      {5.25547576299564,44.3633634279743,10},
      {5.26286965690031,40.0616469466135,10},
      {5.26954659805808,35.8639549036355,10},
      {5.27552392387535,31.8712521951178,10},
      {5.2808357992412,28.0835388210604,10},
      {5.28551638904471,24.5008147814633,10},
      {5.28959985817495,21.1291991609373,10},
      {5.29312139136844,17.9625728748715,10},
      {5.29611515351426,15.0070550078768,10},
      {5.2986163293489,12.2657051022586,10},
      {5.30066061353261,9.73240407340596,10},
      {5.30228268087818,7.41633054823516,10},
      {5.30351873596955,5.31136544213541,10},
      {5.30440396354324,3.41138967049596,10},
      {5.30497252848832,1.65827192951463,10},
   }; 
}; 