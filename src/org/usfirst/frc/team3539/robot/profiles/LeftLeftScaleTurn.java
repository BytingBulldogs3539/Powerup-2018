package org.usfirst.frc.team3539.robot.profiles;
public class RightRightScaleTurn implements IProfile
{
  public static final int kNumPoints = 124;
  public static double PointsR[][] = new double[][] {
      {0,-0.348422141775193,10},
      {-4.66215942554607E-05,-2.45609873736474,10},
      {-0.000460016614363236,-2.82144346458472,10},
      {-0.000933965251000024,-3.21587177071149,10},
      {-0.00147336669260884,-3.6398877631452,10},
      {-0.00208319300666867,-4.09393005595853,10},
      {-0.00276848118380757,-4.57838850176869,10},
      {-0.00353432709988762,-5.09361207961987,10},
      {-0.00438587978932249,-5.63991582675883,10},
      {-0.00532833783477769,-6.21758561916974,10},
      {-0.00636694388947443,-6.82688677653688,10},
      {-0.00750698343225862,-7.82403607283355,10},
      {-0.00881378645566396,-8.92682275997217,10},
      {-0.0103015904880194,-10.1044616276653,10},
      {-0.011985667346288,-11.3717192700179,10},
      {-0.0138809542099933,-12.7266404482752,10},
      {-0.0160020605928324,-14.1659132078918,10},
      {-0.0183630462469944,-15.6856739206002,10},
      {-0.0209773255524635,-17.2824595669534,10},
      {-0.0238577352412623,-18.9523099518799,10},
      {-0.0270164537259268,-20.6911893478576,10},
      {-0.0304649841684449,-22.4949692849881,10},
      {-0.0342141445208092,-24.3593568429742,10},
      {-0.0382740376466739,-26.2799979106725,10},
      {-0.0426540393700178,-28.252435117387,10},
      {-0.0473627785562489,-30.2721365160777,10},
      {-0.0524081351203154,-32.3345089688587,10},
      {-0.0577972201078096,-34.4348924103561,10},
      {-0.0635363677274109,-36.5685789698476,10},
      {-0.0696311353508847,-38.7308034101925,10},
      {-0.0760862676590718,-40.9167622499714,10},
      {-0.0829057245283415,-43.1216061146302,10},
      {-0.0900926611116961,-45.3404665074755,10},
      {-0.0976494039360971,-47.5683143058428,10},
      {-0.105577458870023,-49.802181753696,10},
      {-0.113877821858234,-52.0415143089922,10},
      {-0.122551409169911,-54.2858645136692,10},
      {-0.131599049431095,-56.5347581386696,10},
      {-0.141021507527361,-58.7878203900612,10},
      {-0.150819484603823,-61.0447147181902,10},
      {-0.160993594162451,-63.3051389932541,10},
      {-0.171544457672778,-65.5688446274405,10},
      {-0.182472600993637,-67.8355830329371,10},
      {-0.193778518113629,-70.1051515150661,10},
      {-0.205462718956472,-72.3773588524335,10},
      {-0.217525601900069,-74.6520291213568,10},
      {-0.229967613127675,-76.9290246424322,10},
      {-0.242789119146961,-79.2081924385444,10},
      {-0.255990486465599,-81.4894024791454,10},
      {-0.269572065656145,-83.7725476802546,10},
      {-0.283534127615574,-86.0575133090354,10},
      {-0.29787707072179,-88.3442075792188,10},
      {-0.312601086196187,-90.6325463533914,10},
      {-0.327706524611321,-92.9224378452839,10},
      {-0.343193577188586,-95.2137902686273,10},
      {-0.359062562630306,-97.5065500814311,10},
      {-0.375313640287642,-99.8006484439935,10},
      {-0.391947096992686,-102.096031814324,10},
      {-0.408963092096599,-104.392639001577,10},
      {-0.42636188056124,-106.608038287189,10},
      {-0.444129885667629,-108.62494976574,10},
      {-0.462234026114589,-110.408066319026,10},
      {-0.480635388348424,-111.956951962268,10},
      {-0.499294867594042,-113.27145371835,10},
      {-0.51817345468705,-114.351472152148,10},
      {-0.537232044852359,-115.19688488197,10},
      {-0.556431501444644,-115.807577174979,10},
      {-0.575732751559047,-116.183426649483,10},
      {-0.595096658550247,-116.324326221502,10},
      {-0.614484085772918,-116.230138211631,10},
      {-0.63385576910081,-115.90075553589,10},
      {-0.653172508148135,-115.336055812586,10},
      {-0.672395230010034,-114.535893713461,10},
      {-0.691484543079325,-113.5001851011,10},
      {-0.710401246970222,-112.228784647245,10},
      {-0.729106013816006,-110.721585267914,10},
      {-0.747559643230891,-108.978433985992,10},
      {-0.765722679867229,-106.999170175509,10},
      {-0.783555859598769,-104.783702050195,10},
      {-0.801019854558794,-102.414239511795,10},
      {-0.818088849859101,-100.007871244337,10},
      {-0.83475685389601,-97.5996672514952,10},
      {-0.851023484226731,-95.1898952432223,10},
      {-0.866888422148943,-92.7784787309602,10},
      {-0.882351540181715,-90.3653029818724,10},
      {-0.897412392141795,-87.95027620969,10},
      {-0.912070786807788,-85.5332530861532,10},
      {-0.926326341736907,-83.1141341761373,10},
      {-0.940178674486362,-80.6927512048154,10},
      {-0.953627466353832,-78.2689664927838,10},
      {-0.966672334896526,-75.8425735209369,10},
      {-0.979312770190729,-73.413396365592,10},
      {-0.991548326053187,-70.9812285076437,10},
      {-1.00337849256018,-68.5457563440055,10},
      {-1.01480282352846,-66.1067274624373,10},
      {-1.02582061781291,-63.6638167865692,10},
      {-1.03643123800889,-61.2166036293342,10},
      {-1.04663398297129,-58.7646481815258,10},
      {-1.05642808781452,-56.3074150232407,10},
      {-1.06581266017208,-53.8442540017388,10},
      {-1.07478674393701,-51.3744384757228,10},
      {-1.08334912804046,-48.8967637504099,10},
      {-1.09149860141362,-46.4127213526738,10},
      {-1.09923401672812,-43.9277610922462,10},
      {-1.10655537398396,-41.4481932751318,10},
      {-1.11346331058579,-38.9804046958931,10},
      {-1.11996012119033,-36.5307247826743,10},
      {-1.12604861037803,-34.1056168185956,10},
      {-1.13173285753863,-31.7115823310559,10},
      {-1.13701808939024,-29.355161091733,10},
      {-1.1419105524984,-27.0429502387227,10},
      {-1.14641776823794,-24.7816425208182,10},
      {-1.15054802286927,-22.5778924425336,10},
      {-1.15431100494303,-20.4381250427101,10},
      {-1.15771742285728,-18.3679239860552,10},
      {-1.16077874989566,-17.2120193420139,10},
      {-1.16364732576881,-16.0665917181545,10},
      {-1.1663251901716,-14.9341212559585,10},
      {-1.16881412783702,-13.8178013527069,10},
      {-1.17111707082646,-12.7218828599904,10},
      {-1.17323746112502,-11.6519389253395,10},
      {-1.17517937812243,-10.6160237938733,10},
      {-1.17694881342237,-9.6203483364715,10},
      {-1.17855214107132,-8.66622337579072,10},
  }; 
  public static double PointsL[][] = new double[][] {
      {0,0.348422141775193,10},
      {4.66215942554607E-05,2.45609873736474,10},
      {0.000460016614363236,2.82144346458472,10},
      {0.000933965251000024,3.21587177071149,10},
      {0.00147336669260884,3.6398877631452,10},
      {0.00208319300666867,4.09393005595853,10},
      {0.00276848118380757,4.57838850176869,10},
      {0.00353432709988762,5.09361207961987,10},
      {0.00438587978932249,5.63991582675883,10},
      {0.00532833783477769,6.21758561916974,10},
      {0.00636694388947443,6.82688677653688,10},
      {0.00750698343225862,7.82403607283355,10},
      {0.00881378645566396,8.92682275997217,10},
      {0.0103015904880194,10.1044616276653,10},
      {0.011985667346288,11.3717192700179,10},
      {0.0138809542099933,12.7266404482752,10},
      {0.0160020605928324,14.1659132078918,10},
      {0.0183630462469944,15.6856739206002,10},
      {0.0209773255524635,17.2824595669534,10},
      {0.0238577352412623,18.9523099518799,10},
      {0.0270164537259268,20.6911893478576,10},
      {0.0304649841684449,22.4949692849881,10},
      {0.0342141445208092,24.3593568429742,10},
      {0.0382740376466739,26.2799979106725,10},
      {0.0426540393700178,28.252435117387,10},
      {0.0473627785562489,30.2721365160777,10},
      {0.0524081351203154,32.3345089688587,10},
      {0.0577972201078096,34.4348924103561,10},
      {0.0635363677274109,36.5685789698476,10},
      {0.0696311353508847,38.7308034101925,10},
      {0.0760862676590718,40.9167622499714,10},
      {0.0829057245283415,43.1216061146302,10},
      {0.0900926611116961,45.3404665074755,10},
      {0.0976494039360971,47.5683143058428,10},
      {0.105577458870023,49.802181753696,10},
      {0.113877821858234,52.0415143089922,10},
      {0.122551409169911,54.2858645136692,10},
      {0.131599049431095,56.5347581386696,10},
      {0.141021507527361,58.7878203900612,10},
      {0.150819484603823,61.0447147181902,10},
      {0.160993594162451,63.3051389932541,10},
      {0.171544457672778,65.5688446274405,10},
      {0.182472600993637,67.8355830329371,10},
      {0.193778518113629,70.1051515150661,10},
      {0.205462718956472,72.3773588524335,10},
      {0.217525601900069,74.6520291213568,10},
      {0.229967613127675,76.9290246424322,10},
      {0.242789119146961,79.2081924385444,10},
      {0.255990486465599,81.4894024791454,10},
      {0.269572065656145,83.7725476802546,10},
      {0.283534127615574,86.0575133090354,10},
      {0.29787707072179,88.3442075792188,10},
      {0.312601086196187,90.6325463533914,10},
      {0.327706524611321,92.9224378452839,10},
      {0.343193577188586,95.2137902686273,10},
      {0.359062562630306,97.5065500814311,10},
      {0.375313640287642,99.8006484439935,10},
      {0.391947096992686,102.096031814324,10},
      {0.408963092096599,104.392639001577,10},
      {0.42636188056124,106.608038287189,10},
      {0.444129885667629,108.62494976574,10},
      {0.462234026114589,110.408066319026,10},
      {0.480635388348424,111.956951962268,10},
      {0.499294867594042,113.27145371835,10},
      {0.51817345468705,114.351472152148,10},
      {0.537232044852359,115.19688488197,10},
      {0.556431501444644,115.807577174979,10},
      {0.575732751559047,116.183426649483,10},
      {0.595096658550247,116.324326221502,10},
      {0.614484085772918,116.230138211631,10},
      {0.63385576910081,115.90075553589,10},
      {0.653172508148135,115.336055812586,10},
      {0.672395230010034,114.535893713461,10},
      {0.691484543079325,113.5001851011,10},
      {0.710401246970222,112.228784647245,10},
      {0.729106013816006,110.721585267914,10},
      {0.747559643230891,108.978433985992,10},
      {0.765722679867229,106.999170175509,10},
      {0.783555859598769,104.783702050195,10},
      {0.801019854558794,102.414239511795,10},
      {0.818088849859101,100.007871244337,10},
      {0.83475685389601,97.5996672514952,10},
      {0.851023484226731,95.1898952432223,10},
      {0.866888422148943,92.7784787309602,10},
      {0.882351540181715,90.3653029818724,10},
      {0.897412392141795,87.95027620969,10},
      {0.912070786807788,85.5332530861532,10},
      {0.926326341736907,83.1141341761373,10},
      {0.940178674486362,80.6927512048154,10},
      {0.953627466353832,78.2689664927838,10},
      {0.966672334896526,75.8425735209369,10},
      {0.979312770190729,73.413396365592,10},
      {0.991548326053187,70.9812285076437,10},
      {1.00337849256018,68.5457563440055,10},
      {1.01480282352846,66.1067274624373,10},
      {1.02582061781291,63.6638167865692,10},
      {1.03643123800889,61.2166036293342,10},
      {1.04663398297129,58.7646481815258,10},
      {1.05642808781452,56.3074150232407,10},
      {1.06581266017208,53.8442540017388,10},
      {1.07478674393701,51.3744384757228,10},
      {1.08334912804046,48.8967637504099,10},
      {1.09149860141362,46.4127213526738,10},
      {1.09923401672812,43.9277610922462,10},
      {1.10655537398396,41.4481932751318,10},
      {1.11346331058579,38.9804046958931,10},
      {1.11996012119033,36.5307247826743,10},
      {1.12604861037803,34.1056168185956,10},
      {1.13173285753863,31.7115823310559,10},
      {1.13701808939024,29.355161091733,10},
      {1.1419105524984,27.0429502387227,10},
      {1.14641776823794,24.7816425208182,10},
      {1.15054802286927,22.5778924425336,10},
      {1.15431100494303,20.4381250427101,10},
      {1.15771742285728,18.3679239860552,10},
      {1.16077874989566,17.2120193420139,10},
      {1.16364732576881,16.0665917181545,10},
      {1.1663251901716,14.9341212559585,10},
      {1.16881412783702,13.8178013527069,10},
      {1.17111707082646,12.7218828599904,10},
      {1.17323746112502,11.6519389253395,10},
      {1.17517937812243,10.6160237938733,10},
      {1.17694881342237,9.6203483364715,10},
      {1.17855214107132,8.66622337579072,10},
   }; 
}; 
