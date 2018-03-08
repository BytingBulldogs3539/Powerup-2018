package org.usfirst.frc.team3539.robot.profiles;
public class Reverse1000 implements IProfile
{
  public static final int kNumPoints = 128;
  public static double PointsR[][] = new double[][] {
      {0,-0.580703519828083,10},
      {-9.67839199713472E-05,-0.937534293746441,10},
      {-0.000253039638708081,-1.36344702313943,10},
      {-0.00048028079117982,-1.96467768156917,10},
      {-0.00080772707393121,-2.653345039525,10},
      {-0.00124995125963469,-3.47106341386818,10},
      {-0.00182846183359244,-4.43686076747071,10},
      {-0.00256793874270454,-5.53367226409763,10},
      {-0.00349021745338748,-6.77696699745025,10},
      {-0.00461971168405744,-8.16745392084717,10},
      {-0.00598095404403642,-9.70730913375307,10},
      {-0.00759883891958083,-11.4003890936332,10},
      {-0.00949890382827638,-13.2483497777603,10},
      {-0.0117069621644076,-15.2534973161471,10},
      {-0.0142492117569365,-17.4175440963776,10},
      {-0.0171521367689442,-19.742102114804,10},
      {-0.0204424872807627,-22.2286380395189,10},
      {-0.0241472603670248,-24.8784655614997,10},
      {-0.0282936712142658,-27.692730096897,10},
      {-0.0329091262304153,-30.6726879702698,10},
      {-0.038021238979913,-33.8190103687115,10},
      {-0.0436577405486805,-37.1325635251373,10},
      {-0.0498465014549057,-40.6180285392743,10},
      {-0.0566161730374692,-44.2066077779583,10},
      {-0.0639839413191646,-47.8173725227842,10},
      {-0.0719535032469441,-51.4468234222402,10},
      {-0.0805279741360198,-55.0955685603594,10},
      {-0.0897105688960797,-58.7598485245343,10},
      {-0.0995038769835021,-62.4386115970972,10},
      {-0.109910312568387,-66.1301406099293,10},
      {-0.120932002988744,-69.8332423415314,10},
      {-0.132570876393631,-73.5467618146834,10},
      {-0.144828677678267,-77.2696970292802,10},
      {-0.15770696051648,-81.0013825348704,10},
      {-0.171207190938959,-84.7409999038872,10},
      {-0.185330691560345,-88.4878913347351,10},
      {-0.200078673449467,-92.2414678655203,10},
      {-0.215452252064459,-96.001362351166,10},
      {-0.231452479122986,-99.7668940435094,10},
      {-0.248080294796904,-103.537971156281,10},
      {-0.265336623322951,-107.313828803905,10},
      {-0.283222245521819,-111.094658207776,10},
      {-0.301738021889782,-114.879694482316,10},
      {-0.320884637636835,-118.668746406132,10},
      {-0.340662762037857,-122.461813979224,10},
      {-0.361073064367727,-126.258514758803,10},
      {-0.382116150160861,-130.058665172332,10},
      {-0.403792593081441,-133.862043402993,10},
      {-0.426102934923415,-137.668511771382,10},
      {-0.449047685610503,-141.477825514116,10},
      {-0.472627323196189,-145.290015226616,10},
      {-0.496842325733958,-149.104683168384,10},
      {-0.521693107536832,-152.921859934842,10},
      {-0.547180082917829,-156.741499632856,10},
      {-0.573303666189972,-160.563250415061,10},
      {-0.600064207925815,-164.387295853994,10},
      {-0.627462090568148,-168.213635949657,10},
      {-0.655497696559757,-172.041888259261,10},
      {-0.684171344602967,-175.871670340017,10},
      {-0.713483289659637,-179.703364634714,10},
      {-0.743433850432089,-183.536971143352,10},
      {-0.774023345622648,-187.372489865931,10},
      {-0.805252093933637,-191.209155916875,10},
      {-0.837120286586449,-195.048116624547,10},
      {-0.869628306023874,-198.887459775008,10},
      {-0.902776215986375,-202.728332696621,10},
      {-0.936564271435812,-206.571500274964,10},
      {-0.970992854814972,-210.41581518167,10},
      {-1.00606215734525,-214.260512531165,10},
      {-1.04177224276711,-218.10750453739,10},
      {-1.07812355726381,-218.33964730981,10},
      {-1.11451349848211,-214.655958374136,10},
      {-1.15028949154447,-210.669374750229,10},
      {-1.18540105400284,-206.678201812864,10},
      {-1.21984742097165,-202.685499104346,10},
      {-1.25362833748904,-198.691266624676,10},
      {-1.28674354859315,-194.695504373852,10},
      {-1.31919279932213,-190.698212351877,10},
      {-1.35097583471411,-186.699390558748,10},
      {-1.38209239980723,-182.699038994467,10},
      {-1.41254223963964,-178.694863002304,10},
      {-1.44232471680669,-174.689157238989,10},
      {-1.47143957634652,-170.683451475673,10},
      {-1.49988681825914,-166.673921284476,10},
      {-1.52766580513988,-162.66209643655,10},
      {-1.55477615454597,-158.647976931894,10},
      {-1.58121748403462,-154.63156277051,10},
      {-1.60698941116304,-150.61208906682,10},
      {-1.63209142600751,-146.590320706401,10},
      {-1.65652314612524,-142.565492803677,10},
      {-1.68028406159252,-138.535310701919,10},
      {-1.70337328004284,-134.504363714584,10},
      {-1.72579067399527,-130.468827413791,10},
      {-1.74753547856424,-126.429466685116,10},
      {-1.76860705634509,-122.38628152856,10},
      {-1.78900476993319,-118.338507058545,10},
      {-1.80872785444294,-114.286143275073,10},
      {-1.82777554498879,-110.229190178142,10},
      {-1.84614707668515,-106.163823339872,10},
      {-1.86384104724179,-102.095396959296,10},
      {-1.88085694673501,-98.0200866085329,10},
      {-1.89719362783643,-93.9371274020066,10},
      {-1.91284981573676,-89.8465193397168,10},
      {-1.92782423562672,-85.7474975360873,10},
      {-1.94211548521606,-81.6400619911179,10},
      {-1.95572216221458,-77.5196233913507,10},
      {-1.96864209944648,-73.3900061646674,10},
      {-1.98087376714059,-69.2466209976099,10},
      {-1.99241487064019,-65.0879381190255,10},
      {-2.00326286032669,-60.9124277577615,10},
      {-2.01341493161965,-56.7170303715125,10},
      {-2.02286777001491,-52.4986864179732,10},
      {-2.03161755108457,-48.2535714692619,10},
      {-2.03965981299611,-43.9709771273097,10},
      {-2.046988309184,-39.6738499594069,10},
      {-2.05360061751056,-35.4937502846849,10},
      {-2.05951624255801,-31.5194048299994,10},
      {-2.06476947669634,-27.7500487097743,10},
      {-2.06939448481464,-24.1872116951621,10},
      {-2.07342568676383,-20.8316586717393,10},
      {-2.07689762987579,-17.6856842962349,10},
      {-2.07984524392516,-14.7492885686488,10},
      {-2.0823034586866,-12.0255310312864,10},
      {-2.08430771385849,-9.51364679857146,10},
      {-2.08589332165825,-7.21516564165658,10},
      {-2.08709584926519,-5.13085244611814,10},
      {-2.08795099133954,-3.25152858503998,10},
      {-2.08849291277038,-1.49535130175327,10},
  }; 
  public static double PointsL[][] = new double[][] {
      {0,-0.580703519828083,10},
      {-9.67839199713472E-05,-0.937534293746441,10},
      {-0.000253039638708081,-1.36344702313943,10},
      {-0.00048028079117982,-1.96467768156917,10},
      {-0.00080772707393121,-2.653345039525,10},
      {-0.00124995125963469,-3.47106341386818,10},
      {-0.00182846183359244,-4.43686076747071,10},
      {-0.00256793874270454,-5.53367226409763,10},
      {-0.00349021745338748,-6.77696699745025,10},
      {-0.00461971168405744,-8.16745392084717,10},
      {-0.00598095404403642,-9.70730913375307,10},
      {-0.00759883891958083,-11.4003890936332,10},
      {-0.00949890382827638,-13.2483497777603,10},
      {-0.0117069621644076,-15.2534973161471,10},
      {-0.0142492117569365,-17.4175440963776,10},
      {-0.0171521367689442,-19.742102114804,10},
      {-0.0204424872807627,-22.2286380395189,10},
      {-0.0241472603670248,-24.8784655614997,10},
      {-0.0282936712142658,-27.692730096897,10},
      {-0.0329091262304153,-30.6726879702698,10},
      {-0.038021238979913,-33.8190103687115,10},
      {-0.0436577405486805,-37.1325635251373,10},
      {-0.0498465014549057,-40.6180285392743,10},
      {-0.0566161730374692,-44.2066077779583,10},
      {-0.0639839413191646,-47.8173725227842,10},
      {-0.0719535032469441,-51.4468234222402,10},
      {-0.0805279741360198,-55.0955685603594,10},
      {-0.0897105688960797,-58.7598485245343,10},
      {-0.0995038769835021,-62.4386115970972,10},
      {-0.109910312568387,-66.1301406099293,10},
      {-0.120932002988744,-69.8332423415314,10},
      {-0.132570876393631,-73.5467618146834,10},
      {-0.144828677678267,-77.2696970292802,10},
      {-0.15770696051648,-81.0013825348704,10},
      {-0.171207190938959,-84.7409999038872,10},
      {-0.185330691560345,-88.4878913347351,10},
      {-0.200078673449467,-92.2414678655203,10},
      {-0.215452252064459,-96.001362351166,10},
      {-0.231452479122986,-99.7668940435094,10},
      {-0.248080294796904,-103.537971156281,10},
      {-0.265336623322951,-107.313828803905,10},
      {-0.283222245521819,-111.094658207776,10},
      {-0.301738021889782,-114.879694482316,10},
      {-0.320884637636835,-118.668746406132,10},
      {-0.340662762037857,-122.461813979224,10},
      {-0.361073064367727,-126.258514758803,10},
      {-0.382116150160861,-130.058665172332,10},
      {-0.403792593081441,-133.862043402993,10},
      {-0.426102934923415,-137.668511771382,10},
      {-0.449047685610503,-141.477825514116,10},
      {-0.472627323196189,-145.290015226616,10},
      {-0.496842325733958,-149.104683168384,10},
      {-0.521693107536832,-152.921859934842,10},
      {-0.547180082917829,-156.741499632856,10},
      {-0.573303666189972,-160.563250415061,10},
      {-0.600064207925815,-164.387295853994,10},
      {-0.627462090568148,-168.213635949657,10},
      {-0.655497696559757,-172.041888259261,10},
      {-0.684171344602967,-175.871670340017,10},
      {-0.713483289659637,-179.703364634714,10},
      {-0.743433850432089,-183.536971143352,10},
      {-0.774023345622648,-187.372489865931,10},
      {-0.805252093933637,-191.209155916875,10},
      {-0.837120286586449,-195.048116624547,10},
      {-0.869628306023874,-198.887459775008,10},
      {-0.902776215986375,-202.728332696621,10},
      {-0.936564271435812,-206.571500274964,10},
      {-0.970992854814972,-210.41581518167,10},
      {-1.00606215734525,-214.260512531165,10},
      {-1.04177224276711,-218.10750453739,10},
      {-1.07812355726381,-218.33964730981,10},
      {-1.11451349848211,-214.655958374136,10},
      {-1.15028949154447,-210.669374750229,10},
      {-1.18540105400284,-206.678201812864,10},
      {-1.21984742097165,-202.685499104346,10},
      {-1.25362833748904,-198.691266624676,10},
      {-1.28674354859315,-194.695504373852,10},
      {-1.31919279932213,-190.698212351877,10},
      {-1.35097583471411,-186.699390558748,10},
      {-1.38209239980723,-182.699038994467,10},
      {-1.41254223963964,-178.694863002304,10},
      {-1.44232471680669,-174.689157238989,10},
      {-1.47143957634652,-170.683451475673,10},
      {-1.49988681825914,-166.673921284476,10},
      {-1.52766580513988,-162.66209643655,10},
      {-1.55477615454597,-158.647976931894,10},
      {-1.58121748403462,-154.63156277051,10},
      {-1.60698941116304,-150.61208906682,10},
      {-1.63209142600751,-146.590320706401,10},
      {-1.65652314612524,-142.565492803677,10},
      {-1.68028406159252,-138.535310701919,10},
      {-1.70337328004284,-134.504363714584,10},
      {-1.72579067399527,-130.468827413791,10},
      {-1.74753547856424,-126.429466685116,10},
      {-1.76860705634509,-122.38628152856,10},
      {-1.78900476993319,-118.338507058545,10},
      {-1.80872785444294,-114.286143275073,10},
      {-1.82777554498879,-110.229190178142,10},
      {-1.84614707668515,-106.163823339872,10},
      {-1.86384104724179,-102.095396959296,10},
      {-1.88085694673501,-98.0200866085329,10},
      {-1.89719362783643,-93.9371274020066,10},
      {-1.91284981573676,-89.8465193397168,10},
      {-1.92782423562672,-85.7474975360873,10},
      {-1.94211548521606,-81.6400619911179,10},
      {-1.95572216221458,-77.5196233913507,10},
      {-1.96864209944648,-73.3900061646674,10},
      {-1.98087376714059,-69.2466209976099,10},
      {-1.99241487064019,-65.0879381190255,10},
      {-2.00326286032669,-60.9124277577615,10},
      {-2.01341493161965,-56.7170303715125,10},
      {-2.02286777001491,-52.4986864179732,10},
      {-2.03161755108457,-48.2535714692619,10},
      {-2.03965981299611,-43.9709771273097,10},
      {-2.046988309184,-39.6738499594069,10},
      {-2.05360061751056,-35.4937502846849,10},
      {-2.05951624255801,-31.5194048299994,10},
      {-2.06476947669634,-27.7500487097743,10},
      {-2.06939448481464,-24.1872116951621,10},
      {-2.07342568676383,-20.8316586717393,10},
      {-2.07689762987579,-17.6856842962349,10},
      {-2.07984524392516,-14.7492885686488,10},
      {-2.0823034586866,-12.0255310312864,10},
      {-2.08430771385849,-9.51364679857146,10},
      {-2.08589332165825,-7.21516564165658,10},
      {-2.08709584926519,-5.13085244611814,10},
      {-2.08795099133954,-3.25152858503998,10},
      {-2.08849291277038,-1.49535130175327,10},
   }; 
}; 
