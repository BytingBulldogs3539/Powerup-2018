package org.usfirst.frc.team3539.robot.profiles;
public class A780 implements IProfile
{
  public static final int kNumPoints = 129;
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
      {-0.42636188056124,-106.690416463762,10},
      {-0.444143589867539,-108.989303010032,10},
      {-0.462308474977353,-111.251429155503,10},
      {-0.480850384935841,-113.359943330677,10},
      {-0.499743727946427,-115.235014427951,10},
      {-0.518949558585181,-116.875824019758,10},
      {-0.538428835817479,-118.282242075549,10},
      {-0.558142550478926,-119.454169160201,10},
      {-0.5780515659242,-120.391498189732,10},
      {-0.598116809248442,-121.094129729018,10},
      {-0.618299207546795,-121.561949045222,10},
      {-0.638559496693005,-121.794833756651,10},
      {-0.658858667522679,-121.792699725893,10},
      {-0.679157455909565,-121.555424571256,10},
      {-0.699416661467875,-121.082916506469,10},
      {-0.719597147552287,-120.375060798697,10},
      {-0.739659650036547,-119.431758012814,10},
      {-0.759564968534869,-118.252878118273,10},
      {-0.779273775180535,-116.838298733382,10},
      {-0.798746805847292,-115.187905125304,10},
      {-0.817944796408889,-113.301582561202,10},
      {-0.836828418998609,-111.179239254808,10},
      {-0.855358282009269,-108.858530523044,10},
      {-0.873501367880158,-106.456177904862,10},
      {-0.891244099892295,-104.051805988758,10},
      {-0.908586031862428,-101.646064927472,10},
      {-0.925527036309627,-99.2389164767262,10},
      {-0.942066858272033,-96.8302153082601,10},
      {-0.958205242787788,-94.4199384755067,10},
      {-0.973941871154568,-92.0079941921969,10},
      {-0.989276552150979,-89.5942218323597,10},
      {-1.00420890333423,-87.1785831517161,10},
      {-1.01873866974247,-84.7609098754395,10},
      {-1.03286553267337,-82.3410949195491,10},
      {-1.04658904594368,-79.9189547115066,10},
      {-1.0599088271106,-77.4943668696199,10},
      {-1.07282455747182,-75.0671095770716,10},
      {-1.08533579084409,-72.6369763147564,10},
      {-1.09744188982275,-70.2037605635684,10},
      {-1.10914259944595,-67.7671946135561,10},
      {-1.12043702734718,-65.3269801593446,10},
      {-1.13132491856458,-62.8827347581458,10},
      {-1.14180538073165,-60.4340491961763,10},
      {-1.15187777644374,-57.9804492443787,10},
      {-1.16154108585342,-55.5213994828498,10},
      {-1.17079467155604,-53.0561732702918,10},
      {-1.17963738622322,-50.5839101104315,10},
      {-1.18806808252662,-48.1038833619713,10},
      {-1.196085358176,-45.6188083687072,10},
      {-1.2036884482858,-43.1348807038076,10},
      {-1.21087760781786,-40.6584106732774,10},
      {-1.21765398410055,-38.1956703388426,10},
      {-1.22401999927154,-35.7531229836232,10},
      {-1.22997884035405,-33.3372318907395,10},
      {-1.23553509666154,-30.9544985875903,10},
      {-1.24069412239305,-28.6114628458533,10},
      {-1.24546267403784,-26.3147791700429,10},
      {-1.2498485279326,-24.0711403089519,10},
      {-1.25386035278053,-21.8872390113734,10},
      {-1.25750821957505,-19.7693855833122,10},
      {-1.26080309167608,-17.7223223153418,10},
      {-1.26375682481006,-16.5744260232848,10},
      {-1.26651920906903,-15.4380680301469,10},
      {-1.26909228414785,-14.3159579430824,10},
      {-1.27147821722233,-13.2115817281054,10},
      {-1.27368019531569,-12.1295554696693,10},
      {-1.27570178789397,-11.0760890825468,10},
      {-1.27754783923248,-10.0591278156624,10},
      {-1.2792243409349,-9.08339866187774,10},
      {-1.28073817697141,-8.14916072618192,10},
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
      {0.42636188056124,106.690416463762,10},
      {0.444143589867539,108.989303010032,10},
      {0.462308474977353,111.251429155503,10},
      {0.480850384935841,113.359943330677,10},
      {0.499743727946427,115.235014427951,10},
      {0.518949558585181,116.875824019758,10},
      {0.538428835817479,118.282242075549,10},
      {0.558142550478926,119.454169160201,10},
      {0.5780515659242,120.391498189732,10},
      {0.598116809248442,121.094129729018,10},
      {0.618299207546795,121.561949045222,10},
      {0.638559496693005,121.794833756651,10},
      {0.658858667522679,121.792699725893,10},
      {0.679157455909565,121.555424571256,10},
      {0.699416661467875,121.082916506469,10},
      {0.719597147552287,120.375060798697,10},
      {0.739659650036547,119.431758012814,10},
      {0.759564968534869,118.252878118273,10},
      {0.779273775180535,116.838298733382,10},
      {0.798746805847292,115.187905125304,10},
      {0.817944796408889,113.301582561202,10},
      {0.836828418998609,111.179239254808,10},
      {0.855358282009269,108.858530523044,10},
      {0.873501367880158,106.456177904862,10},
      {0.891244099892295,104.051805988758,10},
      {0.908586031862428,101.646064927472,10},
      {0.925527036309627,99.2389164767262,10},
      {0.942066858272033,96.8302153082601,10},
      {0.958205242787788,94.4199384755067,10},
      {0.973941871154568,92.0079941921969,10},
      {0.989276552150979,89.5942218323597,10},
      {1.00420890333423,87.1785831517161,10},
      {1.01873866974247,84.7609098754395,10},
      {1.03286553267337,82.3410949195491,10},
      {1.04658904594368,79.9189547115066,10},
      {1.0599088271106,77.4943668696199,10},
      {1.07282455747182,75.0671095770716,10},
      {1.08533579084409,72.6369763147564,10},
      {1.09744188982275,70.2037605635684,10},
      {1.10914259944595,67.7671946135561,10},
      {1.12043702734718,65.3269801593446,10},
      {1.13132491856458,62.8827347581458,10},
      {1.14180538073165,60.4340491961763,10},
      {1.15187777644374,57.9804492443787,10},
      {1.16154108585342,55.5213994828498,10},
      {1.17079467155604,53.0561732702918,10},
      {1.17963738622322,50.5839101104315,10},
      {1.18806808252662,48.1038833619713,10},
      {1.196085358176,45.6188083687072,10},
      {1.2036884482858,43.1348807038076,10},
      {1.21087760781786,40.6584106732774,10},
      {1.21765398410055,38.1956703388426,10},
      {1.22401999927154,35.7531229836232,10},
      {1.22997884035405,33.3372318907395,10},
      {1.23553509666154,30.9544985875903,10},
      {1.24069412239305,28.6114628458533,10},
      {1.24546267403784,26.3147791700429,10},
      {1.2498485279326,24.0711403089519,10},
      {1.25386035278053,21.8872390113734,10},
      {1.25750821957505,19.7693855833122,10},
      {1.26080309167608,17.7223223153418,10},
      {1.26375682481006,16.5744260232848,10},
      {1.26651920906903,15.4380680301469,10},
      {1.26909228414785,14.3159579430824,10},
      {1.27147821722233,13.2115817281054,10},
      {1.27368019531569,12.1295554696693,10},
      {1.27570178789397,11.0760890825468,10},
      {1.27754783923248,10.0591278156624,10},
      {1.2792243409349,9.08339866187774,10},
      {1.28073817697141,8.14916072618192,10},
   }; 
}; 