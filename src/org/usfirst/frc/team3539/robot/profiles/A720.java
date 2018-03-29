package org.usfirst.frc.team3539.robot.profiles;
public class A720 implements IProfile
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
      {-0.42636188056124,-106.618173021076,10},
      {-0.444131574789944,-108.655468700237,10},
      {-0.462240814474079,-110.459068889257,10},
      {-0.480650654189718,-112.028445817088,10},
      {-0.499322052902234,-113.363469453184,10},
      {-0.518215969577002,-114.464009766996,10},
      {-0.537293299438931,-115.329952025687,10},
      {-0.55651493771293,-115.961181496421,10},
      {-0.575841811494141,-116.357591095217,10},
      {-0.595234784137242,-116.519043142672,10},
      {-0.614654591515978,-116.445415257093,10},
      {-0.634062160725494,-116.136615652211,10},
      {-0.65341829138,-115.592498999767,10},
      {-0.672683719353245,-114.81295821578,10},
      {-0.691819180518976,-113.797855620846,10},
      {-0.710785474491406,-112.54709177984,10},
      {-0.729543337144281,-111.060529013359,10},
      {-0.748053440610886,-109.338021993143,10},
      {-0.766276457024503,-107.379455986356,10},
      {-0.78417299477795,-105.184678015882,10},
      {-0.801703789744975,-102.825786196147,10},
      {-0.818841433525759,-100.419762127198,10},
      {-0.83557802230268,-98.0118258443084,10},
      {-0.851913364854344,-95.6023444925545,10},
      {-0.867847078737962,-93.1912109879556,10},
      {-0.88337897273214,-90.7783411930984,10},
      {-0.898508664394091,-88.363635672858,10},
      {-0.91323596250242,-85.9469643966864,10},
      {-0.927560420873874,-83.5281973340356,10},
      {-0.941481784546594,-81.1072044543576,10},
      {-0.954999671077793,-78.683840429393,10},
      {-0.968113634284218,-76.2579063888919,10},
      {-0.98082329172308,-73.8292034626044,10},
      {-0.993128133470661,-71.3975404291364,10},
      {-1.00502777708417,-68.9626342808247,10},
      {-1.01652152141851,-66.5242402542849,10},
      {-1.02760892029041,-64.0819988532961,10},
      {-1.0382892088143,-61.6355505816374,10},
      {-1.048561813326,-59.184436507963,10},
      {-1.05842590519946,-56.7281594566483,10},
      {-1.06788059206819,-54.266050152814,10},
      {-1.07692498156568,-51.7974201994413,10},
      {-1.08555786262309,-49.3211031460263,10},
      {-1.09377796043113,-46.8378447560061,10},
      {-1.1015843826233,-44.3525785413479,10},
      {-1.10897636431402,-41.8716530523355,10},
      {-1.11595505283166,-39.401397717113,10},
      {-1.12252197794736,-36.9481610859643,10},
      {-1.12867994424158,-34.5183873198699,10},
      {-1.13443303110406,-32.1185970683682,10},
      {-1.1397860828101,-29.7552727367187,10},
      {-1.14474534592526,-27.4350305851569,10},
      {-1.14931783190065,-25.164582484615,10},
      {-1.1535119544776,-22.9505064510497,10},
      {-1.15733701976397,-20.7993805004176,10},
      {-1.1608036086769,-18.7175914272811,10},
      {-1.16392319450002,-17.5576673095361,10},
      {-1.16684939175325,-16.4076446355768,10},
      {-1.16958411265054,-15.2699060239736,10},
      {-1.17212901444397,-14.1475148414598,10},
      {-1.17448690171398,-13.0445622697618,10},
      {-1.17666108896474,-11.9663613953144,10},
      {-1.17865540062413,-10.9206241769409,10},
      {-1.18047557333397,-9.9143827814089,10},
      {-1.18212798114073,-8.9497176974861,10},
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
      {0.42636188056124,106.618173021076,10},
      {0.444131574789944,108.655468700237,10},
      {0.462240814474079,110.459068889257,10},
      {0.480650654189718,112.028445817088,10},
      {0.499322052902234,113.363469453184,10},
      {0.518215969577002,114.464009766996,10},
      {0.537293299438931,115.329952025687,10},
      {0.55651493771293,115.961181496421,10},
      {0.575841811494141,116.357591095217,10},
      {0.595234784137242,116.519043142672,10},
      {0.614654591515978,116.445415257093,10},
      {0.634062160725494,116.136615652211,10},
      {0.65341829138,115.592498999767,10},
      {0.672683719353245,114.81295821578,10},
      {0.691819180518976,113.797855620846,10},
      {0.710785474491406,112.54709177984,10},
      {0.729543337144281,111.060529013359,10},
      {0.748053440610886,109.338021993143,10},
      {0.766276457024503,107.379455986356,10},
      {0.78417299477795,105.184678015882,10},
      {0.801703789744975,102.825786196147,10},
      {0.818841433525759,100.419762127198,10},
      {0.83557802230268,98.0118258443084,10},
      {0.851913364854344,95.6023444925545,10},
      {0.867847078737962,93.1912109879556,10},
      {0.88337897273214,90.7783411930984,10},
      {0.898508664394091,88.363635672858,10},
      {0.91323596250242,85.9469643966864,10},
      {0.927560420873874,83.5281973340356,10},
      {0.941481784546594,81.1072044543576,10},
      {0.954999671077793,78.683840429393,10},
      {0.968113634284218,76.2579063888919,10},
      {0.98082329172308,73.8292034626044,10},
      {0.993128133470661,71.3975404291364,10},
      {1.00502777708417,68.9626342808247,10},
      {1.01652152141851,66.5242402542849,10},
      {1.02760892029041,64.0819988532961,10},
      {1.0382892088143,61.6355505816374,10},
      {1.048561813326,59.184436507963,10},
      {1.05842590519946,56.7281594566483,10},
      {1.06788059206819,54.266050152814,10},
      {1.07692498156568,51.7974201994413,10},
      {1.08555786262309,49.3211031460263,10},
      {1.09377796043113,46.8378447560061,10},
      {1.1015843826233,44.3525785413479,10},
      {1.10897636431402,41.8716530523355,10},
      {1.11595505283166,39.401397717113,10},
      {1.12252197794736,36.9481610859643,10},
      {1.12867994424158,34.5183873198699,10},
      {1.13443303110406,32.1185970683682,10},
      {1.1397860828101,29.7552727367187,10},
      {1.14474534592526,27.4350305851569,10},
      {1.14931783190065,25.164582484615,10},
      {1.1535119544776,22.9505064510497,10},
      {1.15733701976397,20.7993805004176,10},
      {1.1608036086769,18.7175914272811,10},
      {1.16392319450002,17.5576673095361,10},
      {1.16684939175325,16.4076446355768,10},
      {1.16958411265054,15.2699060239736,10},
      {1.17212901444397,14.1475148414598,10},
      {1.17448690171398,13.0445622697618,10},
      {1.17666108896474,11.9663613953144,10},
      {1.17865540062413,10.9206241769409,10},
      {1.18047557333397,9.9143827814089,10},
      {1.18212798114073,8.9497176974861,10},
   }; 
}; 
