package org.usfirst.frc.team3539.robot.profiles;
public class Straight533 implements IProfile
{
  public static final int kNumPoints = 98;
  public static double PointsR[][] = new double[][] {
      {0,9.10329237961149,10},
      {0.00151721540158164,9.39165615410727,10},
      {0.00308249136252977,8.95945755919387,10},
      {0.0045757342492243,2.08517297473161,10},
      {0.0049232631978596,1.85568865774237,10},
      {0.00523254487984341,2.572412496692,10},
      {0.00566128017644537,3.9018400386898,10},
      {0.00631158678980365,4.86410959659819,10},
      {0.00712227188192118,4.89163065768855,10},
      {0.00793754329966249,6.96687422250549,10},
      {0.00909868940179131,8.00026140714193,10},
      {0.010432066223306,10.0135234253868,10},
      {0.0121009867942038,11.3873124185986,10},
      {0.0139988720777902,13.0318881157618,10},
      {0.0161708533109038,15.3388681075369,10},
      {0.0187273309702865,17.3207726854725,10},
      {0.021614126656892,19.8503525459962,10},
      {0.0249225197039984,22.1825861911812,10},
      {0.0286196160480437,24.7213312931234,10},
      {0.0327398395237425,27.8100769298058,10},
      {0.0373748509112164,30.4574319591611,10},
      {0.0424510897304277,33.8414215160984,10},
      {0.0480913280839379,36.9798694175316,10},
      {0.0542546406096335,40.4931074269457,10},
      {0.0610034889791369,44.0147591776996,10},
      {0.0683392834502294,47.6389170689673,10},
      {0.0762791064674495,51.2171703523707,10},
      {0.0848153012074757,54.7678609840305,10},
      {0.0939432783568497,58.408804289271,10},
      {0.103678072697682,62.0160964535803,10},
      {0.114014091004195,65.6019335774731,10},
      {0.12494774787525,69.2642592590004,10},
      {0.136491791403785,72.8974886932035,10},
      {0.148641377314485,76.4695043347318,10},
      {0.161386283230323,80.1118741515722,10},
      {0.174738269267037,83.7358561191573,10},
      {0.188694244012087,87.3062578521195,10},
      {0.203245283800417,90.9806840234645,10},
      {0.21840874197354,94.5648001548106,10},
      {0.234169527976439,98.1106337630606,10},
      {0.250521315567994,101.74979106048,10},
      {0.267479593681126,105.316987922878,10},
      {0.285032442848935,108.850537468772,10},
      {0.303174190170066,112.442187723045,10},
      {0.321914556065382,115.974176902363,10},
      {0.341243597022393,119.506181379393,10},
      {0.361161281170866,123.015269884555,10},
      {0.38166381595315,126.550410392448,10},
      {0.402755567591079,129.992303699728,10},
      {0.424420951541034,133.513867488641,10},
      {0.446673257689904,136.96827432395,10},
      {0.469501299586134,140.387695292998,10},
      {0.492899244977206,143.839501517348,10},
      {0.516872511802618,147.233512987549,10},
      {0.541411443381969,150.621818411351,10},
      {0.566515051738057,151.443565581441,10},
      {0.591755638352774,148.485554187468,10},
      {0.616503256213538,144.349848471596,10},
      {0.640561520948622,140.258781477961,10},
      {0.663938017673323,136.135788160369,10},
      {0.686627328448144,132.072731276539,10},
      {0.708639460526042,128.026586012802,10},
      {0.729977218487462,124.3766361799,10},
      {0.75070663745383,120.929908795777,10},
      {0.770861627352364,117.436944078564,10},
      {0.790434475586834,113.91155586177,10},
      {0.809419700477278,110.350592816819,10},
      {0.827811501641408,106.746436683373,10},
      {0.845602548925785,103.157180520954,10},
      {0.862795391948995,99.4635633704985,10},
      {0.879372693304642,95.7313042007261,10},
      {0.895327887724863,91.9789438380074,10},
      {0.910657724445957,88.2858621074553,10},
      {0.925372019499488,84.3860088590501,10},
      {0.93943635303452,80.5731001541079,10},
      {0.95286519413654,76.7140535512006,10},
      {0.965650893949783,72.7568797777041,10},
      {0.977777007434359,68.8500737194099,10},
      {0.989252012072071,64.8819161890371,10},
      {1.00006570938857,60.8110345257612,10},
      {1.01020088945839,56.7462222295337,10},
      {1.01965857212895,52.6813602157437,10},
      {1.02843882114074,48.5336916894586,10},
      {1.03652774107244,44.3753185895326,10},
      {1.04392361093151,40.1556399106626,10},
      {1.05061623224359,35.8885153794919,10},
      {1.05659763745061,32.0529565004203,10},
      {1.06193978953719,28.2893580563711,10},
      {1.06665473545117,24.6313080852156,10},
      {1.07075987633941,21.3023826409192,10},
      {1.07431034770387,18.2458119160058,10},
      {1.07735127779356,15.2566639424332,10},
      {1.07989401241119,12.2398959506988,10},
      {1.08193408972423,9.84458219203262,10},
      {1.08357476928548,7.96655624616683,10},
      {1.08490261064602,4.88557085170996,10},
      {1.08571683134204,3.64887612477421,10},
      {1.08632504285616,2.45040583743605,10},
  }; 
  public static double PointsL[][] = new double[][] {
      {0,-8.35672485671358,10},
      {-0.00139278754085534,-10.5527878349559,10},
      {-0.00315158552828717,-7.08387637885147,10},
      {-0.00433223173086135,-4.81133488209785,10},
      {-0.00513412063885091,-2.07445788391399,10},
      {-0.00547986385852999,-2.73610518083198,10},
      {-0.00593588106996633,-3.04054493792857,10},
      {-0.00644263867913446,-4.01199264469961,10},
      {-0.00711130404024215,-6.17669674847231,10},
      {-0.00814075387677988,-6.58899445484968,10},
      {-0.00923891942006587,-8.33835421738373,10},
      {-0.0106286448042608,-9.40465156004936,10},
      {-0.0121960865715846,-11.4163914559973,10},
      {-0.0140988191183221,-13.4694122265005,10},
      {-0.016343720438992,-15.1736528230465,10},
      {-0.018872663213571,-17.5196486719639,10},
      {-0.0217926039418181,-19.640768161436,10},
      {-0.0250660652223818,-22.2820251405338,10},
      {-0.0287797360791375,-25.0425985328996,10},
      {-0.03295350353707,-27.5851814482211,10},
      {-0.0375510335394134,-30.8980289977027,10},
      {-0.0427007053577329,-33.8077703751671,10},
      {-0.0483353345503499,-37.2957671605619,10},
      {-0.0545512927161048,-40.7585418440766,10},
      {-0.0613443849356648,-44.4125187995381,10},
      {-0.0687464734738196,-48.0091331612016,10},
      {-0.0767479972608648,-51.6944742497211,10},
      {-0.0853637401008308,-55.4409870622087,10},
      {-0.0946039004680687,-59.1278311508857,10},
      {-0.104458542817644,-62.8789141546919,10},
      {-0.11493835961251,-66.6789307132448,10},
      {-0.126051517599705,-70.4238563881615,10},
      {-0.137788830184755,-74.2161973199558,10},
      {-0.150158193217724,-78.091122947428,10},
      {-0.163173374638987,-81.9139981114299,10},
      {-0.176825705745345,-85.7674534007741,10},
      {-0.191120285773973,-89.6897101477105,10},
      {-0.206068572073401,-93.526276763529,10},
      {-0.221656286779536,-97.4591883665439,10},
      {-0.237899476554367,-101.442551822174,10},
      {-0.254806571074348,-105.344806811289,10},
      {-0.272364057360964,-109.32811672493,10},
      {-0.290585384652266,-113.357289177727,10},
      {-0.309478281479599,-117.331382220173,10},
      {-0.329033505475581,-121.377366857938,10},
      {-0.349263071717808,-125.426426335721,10},
      {-0.370167490129997,-129.510701145439,10},
      {-0.391752592964668,-133.569000440984,10},
      {-0.414014077740454,-137.732945732333,10},
      {-0.436969568695843,-141.820524847741,10},
      {-0.460606349608128,-145.981685955593,10},
      {-0.484936626776299,-150.181320807935,10},
      {-0.50996683798729,-154.358269154082,10},
      {-0.535693222553683,-158.590656406803,10},
      {-0.562124990972628,-162.838800302397,10},
      {-0.589264788473409,-164.447002822084,10},
      {-0.616672614628234,-162.027654446395,10},
      {-0.643677218603396,-158.158358376765,10},
      {-0.670036960297235,-154.208305687984,10},
      {-0.695738326731235,-150.281474925301,10},
      {-0.720785269814209,-146.292168308742,10},
      {-0.74516727236948,-142.277039155126,10},
      {-0.768880127526379,-137.862486753543,10},
      {-0.7918572264993,-133.231854176643,10},
      {-0.814062492185224,-128.643703344652,10},
      {-0.835503127256663,-124.078086041741,10},
      {-0.856182828660569,-119.538077107926,10},
      {-0.876105803267611,-115.031264208124,10},
      {-0.895277723979147,-110.496494740507,10},
      {-0.913693810260326,-106.059286428153,10},
      {-0.931370315929645,-101.641590346851,10},
      {-0.948310619231732,-97.2342967093871,10},
      {-0.964516313678206,-92.7485640560693,10},
      {-0.979974396214267,-88.4569670108835,10},
      {-0.994717246995981,-84.0564120153475,10},
      {-1.00872663625045,-79.6801268391489,10},
      {-1.0220066433674,-75.3832214880632,10},
      {-1.03457052636351,-71.0050393956353,10},
      {-1.04640470851978,-66.663403536045,10},
      {-1.05751524518036,-62.3875095917416,10},
      {-1.06791316344565,-58.0686137803361,10},
      {-1.0775913243836,-53.7067849415304,10},
      {-1.08654239784077,-49.3694018457446,10},
      {-1.0947706544283,-44.9783276069273,10},
      {-1.10226704300019,-40.5933724527208,10},
      {-1.10903258340388,-36.4425984909958,10},
      {-1.11510641228471,-32.2611181978085,10},
      {-1.12048317544362,-28.4179142874012,10},
      {-1.1252196018942,-24.8823320580882,10},
      {-1.12936655652728,-21.4309388719494,10},
      {-1.13293844468788,-18.1264534340312,10},
      {-1.13595948775258,-15.1739759872025,10},
      {-1.13848845442984,-12.6745928531259,10},
      {-1.14060094091077,-9.97316423795097,10},
      {-1.1422631647491,-7.1890228087641,10},
      {-1.14346123052351,-6.03042863581494,10},
      {-1.14446641765176,-3.4284817557796,10},
      {-1.14503778717728,-1.08209581521827,10},
   }; 
}; 
