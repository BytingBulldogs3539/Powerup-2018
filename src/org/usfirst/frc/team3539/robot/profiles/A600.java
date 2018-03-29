package org.usfirst.frc.team3539.robot.profiles;
public class A600 implements IProfile
{
  public static final int kNumPoints = 111;
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
      {-0.312601086196187,-90.6003829149061,10},
      {-0.327701170412286,-92.7092795328683,10},
      {-0.343152719550716,-94.5853755768143,10},
      {-0.35891694753871,-96.2275696115141,10},
      {-0.374954845211872,-97.6357010109968,10},
      {-0.391227467146275,-98.8095862027241,10},
      {-0.407695740437061,-99.7490798584364,10},
      {-0.424320592179371,-100.453998405595,10},
      {-0.441062917598115,-100.924196515942,10},
      {-0.457883611918201,-101.159490616937,10},
      {-0.474743538494307,-101.159727731465,10},
      {-0.491603496940646,-100.924747233557,10},
      {-0.50842428687143,-100.454380848384,10},
      {-0.525166676030638,-99.7484679499753,10},
      {-0.541791400292018,-98.8068479123608,10},
      {-0.558259259269783,-97.6293448118574,10},
      {-0.574530797616287,-96.2157674270711,10},
      {-0.590566751205276,-94.5659398343193,10},
      {-0.60632772842957,-92.679670812208,10},
      {-0.621774337681986,-90.5567614904872,10},
      {-0.636867123614878,-88.2291534908251,10},
      {-0.651571985079634,-85.8132929933644,10},
      {-0.66587419802891,-83.3944417933002,10},
      {-0.679773316279452,-80.9733494784974,10},
      {-0.693268829907543,-78.549847774129,10},
      {-0.706360483951324,-76.1237837030799,10},
      {-0.719047768487078,-73.6949507462444,10},
      {-0.731330301072016,-71.2631041402381,10},
      {-0.743207444301491,-68.8280373659554,10},
      {-0.754678815732716,-66.3894291714542,10},
      {-0.765743714220579,-63.9469774269319,10},
      {-0.776401566100897,-61.5002996896003,10},
      {-0.786651606488094,-59.0489370281136,10},
      {-0.796493070496593,-56.5923540225684,10},
      {-0.805925129500355,-54.1299005202247,10},
      {-0.814946763651943,-51.6608881240638,10},
      {-0.823556953103922,-49.1841312614425,10},
      {-0.83175429556607,-46.7006051614705,10},
      {-0.839537707450485,-44.2153963132305,10},
      {-0.846906933795311,-41.7348723891457,10},
      {-0.853862739486122,-39.2653819394996,10},
      {-0.860406972996395,-36.8132926367154,10},
      {-0.866542566387506,-34.3850103974948,10},
      {-0.872273407827802,-31.987036749237,10},
      {-0.877604532813993,-29.6259114636195,10},
      {-0.882542187911619,-27.3082316787384,10},
      {-0.887093575793192,-25.0406901433866,10},
      {-0.891267046459586,-22.829922239939,10},
      {-0.895072033499575,-20.6824103736551,10},
      {-0.898519054089836,-18.6043692398427,10},
      {-0.901619836475872,-17.4457320420799,10},
      {-0.904527421513415,-16.2971626507157,10},
      {-0.907243657675944,-15.161089577455,10},
      {-0.909770457177397,-14.04064598484,10},
      {-0.912110560857758,-12.9399517378061,10},
      {-0.914267219480726,-11.8643858941692,10},
      {-0.91624463991697,-10.8217780139099,10},
      {-0.91804824010599,-9.81893175422992,10},
      {-0.919684776537044,-8.85768762104731,10},
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
      {0.312601086196187,90.6003829149061,10},
      {0.327701170412286,92.7092795328683,10},
      {0.343152719550716,94.5853755768143,10},
      {0.35891694753871,96.2275696115141,10},
      {0.374954845211872,97.6357010109968,10},
      {0.391227467146275,98.8095862027241,10},
      {0.407695740437061,99.7490798584364,10},
      {0.424320592179371,100.453998405595,10},
      {0.441062917598115,100.924196515942,10},
      {0.457883611918201,101.159490616937,10},
      {0.474743538494307,101.159727731465,10},
      {0.491603496940646,100.924747233557,10},
      {0.50842428687143,100.454380848384,10},
      {0.525166676030638,99.7484679499753,10},
      {0.541791400292018,98.8068479123608,10},
      {0.558259259269783,97.6293448118574,10},
      {0.574530797616287,96.2157674270711,10},
      {0.590566751205276,94.5659398343193,10},
      {0.60632772842957,92.679670812208,10},
      {0.621774337681986,90.5567614904872,10},
      {0.636867123614878,88.2291534908251,10},
      {0.651571985079634,85.8132929933644,10},
      {0.66587419802891,83.3944417933002,10},
      {0.679773316279452,80.9733494784974,10},
      {0.693268829907543,78.549847774129,10},
      {0.706360483951324,76.1237837030799,10},
      {0.719047768487078,73.6949507462444,10},
      {0.731330301072016,71.2631041402381,10},
      {0.743207444301491,68.8280373659554,10},
      {0.754678815732716,66.3894291714542,10},
      {0.765743714220579,63.9469774269319,10},
      {0.776401566100897,61.5002996896003,10},
      {0.786651606488094,59.0489370281136,10},
      {0.796493070496593,56.5923540225684,10},
      {0.805925129500355,54.1299005202247,10},
      {0.814946763651943,51.6608881240638,10},
      {0.823556953103922,49.1841312614425,10},
      {0.83175429556607,46.7006051614705,10},
      {0.839537707450485,44.2153963132305,10},
      {0.846906933795311,41.7348723891457,10},
      {0.853862739486122,39.2653819394996,10},
      {0.860406972996395,36.8132926367154,10},
      {0.866542566387506,34.3850103974948,10},
      {0.872273407827802,31.987036749237,10},
      {0.877604532813993,29.6259114636195,10},
      {0.882542187911619,27.3082316787384,10},
      {0.887093575793192,25.0406901433866,10},
      {0.891267046459586,22.829922239939,10},
      {0.895072033499575,20.6824103736551,10},
      {0.898519054089836,18.6043692398427,10},
      {0.901619836475872,17.4457320420799,10},
      {0.904527421513415,16.2971626507157,10},
      {0.907243657675944,15.161089577455,10},
      {0.909770457177397,14.04064598484,10},
      {0.912110560857758,12.9399517378061,10},
      {0.914267219480726,11.8643858941692,10},
      {0.91624463991697,10.8217780139099,10},
      {0.91804824010599,9.81893175422992,10},
      {0.919684776537044,8.85768762104731,10},
   }; 
}; 