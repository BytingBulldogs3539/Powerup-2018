package org.usfirst.frc.team3539.robot.profiles;
public class RightRightScaleTurn implements IProfile
{
  public static final int kNumPoints = 108;
  public static double PointsR[][] = new double[][] {
      {0,0.224111473868905,10},
      {3.73519123114841E-05,0.348022937236695,10},
      {9.53557351842667E-05,0.562955784189467,10},
      {0.000189181699215845,0.817662681112148,10},
      {0.000325458812734536,1.1786886731467,10},
      {0.000521906924925652,1.59249176994901,10},
      {0.000787322219917154,2.08278342438576,10},
      {0.00113445279064811,2.66180180567846,10},
      {0.00157808642492786,3.32036828691098,10},
      {0.00213148113941302,4.06613172384675,10},
      {0.00280916976005414,4.90062188763848,10},
      {0.00362594007466056,5.82383877828615,10},
      {0.00459657987104158,6.84037170924784,10},
      {0.00573664182258289,7.94945579494719,10},
      {0.00706155112174075,9.15185592096057,10},
      {0.00858686044190085,10.4506316295933,10},
      {0.0103286323801664,11.8450180352691,10},
      {0.0123028020527113,13.337309794717,10},
      {0.0145256870184974,14.9267420223607,10},
      {0.0170134773555575,16.6163742605054,10},
      {0.0197828730656418,18.4031469668459,10},
      {0.0228500642267828,20.2916494548402,10},
      {0.0262320058025895,22.2795870677593,10},
      {0.0299452703138827,24.3707842334848,10},
      {0.0340070676861301,26.5239371308942,10},
      {0.0384277238746125,28.6900930831015,10},
      {0.0432094060551294,30.8684872045304,10},
      {0.0483541539225512,33.057589724028,10},
      {0.0538637522098892,35.2551059848654,10},
      {0.0597396032073667,37.464095529348,10},
      {0.0659836191289247,39.6776743872886,10},
      {0.0725965648601395,41.9004318721454,10},
      {0.0795799701721637,44.1277786704603,10},
      {0.0869345999505738,46.3612445533859,10},
      {0.0946614740428048,48.6008295209222,10},
      {0.102761612296292,50.8450038019167,10},
      {0.111235779596611,53.0922376252165,10},
      {0.120084485867481,55.345590533127,10},
      {0.129308750956335,57.6004732121903,10},
      {0.138908829825034,59.8599452047116,10},
      {0.148885487359152,62.1224767395383,10},
      {0.159239233482409,64.3880678166703,10},
      {0.16997057811852,66.6567184361078,10},
      {0.181080031191205,68.9284285978506,10},
      {0.19256810262418,71.2016685307461,10},
      {0.204435047379304,73.4764382347943,10},
      {0.216681120418437,75.7557972523006,10},
      {0.229307086627153,78.0351562698069,10},
      {0.242312946005455,80.3160450584658,10},
      {0.255698953515199,82.6015231605828,10},
      {0.269465874041963,84.8870012626999,10},
      {0.283613707585746,87.1740091359696,10},
      {0.298142709108408,89.462546780392,10},
      {0.313053133571806,91.7526141959671,10},
      {0.328345235937801,94.0457411538475,10},
      {0.344019526130109,96.3373383405753,10},
      {0.360075749186871,98.6335248407611,10},
      {0.376514669993665,100.928181569794,10},
      {0.393336033588631,103.22436806998,10},
      {0.410540094933627,105.523614112471,10},
      {0.428127363952372,106.456774515612,10},
      {0.445870159704974,105.052444597443,10},
      {0.463378900471215,102.658352743485,10},
      {0.480488625928462,100.253552491459,10},
      {0.497197551343706,97.8472224682791,10},
      {0.513505421755085,95.439362673947,10},
      {0.529411982200743,93.0284433373095,10},
      {0.544916722756961,90.617524000672,10},
      {0.56001964342374,88.2050748928818,10},
      {0.57472048923922,85.7895662427862,10},
      {0.589018750279685,83.372527821538,10},
      {0.602914171583274,80.9524298579843,10},
      {0.616406243226272,78.5338616655834,10},
      {0.629495220170536,76.1091743885717,10},
      {0.642180082568631,73.6829573404073,10},
      {0.654460575458699,71.2552105210902,10},
      {0.666336443878881,68.8228743883151,10},
      {0.6778069229436,66.3905382555399,10},
      {0.688872012652856,63.9505532670014,10},
      {0.699530438197357,61.5105682784628,10},
      {0.7097821995771,59.0659939764661,10},
      {0.719626531906511,56.6168303610114,10},
      {0.729062670300013,54.1630774320986,10},
      {0.73808984987203,51.7032054185751,10},
      {0.746707050775126,49.2402738627461,10},
      {0.754913763085583,46.7681636800011,10},
      {0.76270845703225,44.291464183798,10},
      {0.77009036772955,41.8055860606787,10},
      {0.77705796540633,39.312059081796,10},
      {0.783609975253296,36.8078237048445,10},
      {0.789744612537436,34.2928799298242,10},
      {0.79546009252574,31.7626384432769,10},
      {0.80075386559962,29.2170992452028,10},
      {0.805623382140487,26.6501432509911,10},
      {0.810065072682319,24.0694193164051,10},
      {0.814076642568386,21.5514159990794,10},
      {0.8176685452349,19.1527348316634,10},
      {0.820860667706844,16.8794948987679,10},
      {0.823673916856638,14.7271068869348,10},
      {0.826128434671127,12.7016898807749,10},
      {0.82824538298459,10.8001843379827,10},
      {0.830045413707587,9.02717957201643,10},
      {0.831549943636256,7.37808626941794,10},
      {0.832779624681159,5.85902351479799,10},
      {0.833756128600292,4.46693176585121,10},
      {0.834500617227934,3.2018110225776,10},
      {0.835034252398364,2.06060174267177,10},
      {0.835377686022142,1.00658941846921,10},
  }; 
  public static double PointsL[][] = new double[][] {
      {0,-0.224111473868905,10},
      {-3.73519123114841E-05,-0.348022937236695,10},
      {-9.53557351842667E-05,-0.562955784189467,10},
      {-0.000189181699215845,-0.817662681112148,10},
      {-0.000325458812734536,-1.1786886731467,10},
      {-0.000521906924925652,-1.59249176994901,10},
      {-0.000787322219917154,-2.08278342438576,10},
      {-0.00113445279064811,-2.66180180567846,10},
      {-0.00157808642492786,-3.32036828691098,10},
      {-0.00213148113941302,-4.06613172384675,10},
      {-0.00280916976005414,-4.90062188763848,10},
      {-0.00362594007466056,-5.82383877828615,10},
      {-0.00459657987104158,-6.84037170924784,10},
      {-0.00573664182258289,-7.94945579494719,10},
      {-0.00706155112174075,-9.15185592096057,10},
      {-0.00858686044190085,-10.4506316295933,10},
      {-0.0103286323801664,-11.8450180352691,10},
      {-0.0123028020527113,-13.337309794717,10},
      {-0.0145256870184974,-14.9267420223607,10},
      {-0.0170134773555575,-16.6163742605054,10},
      {-0.0197828730656418,-18.4031469668459,10},
      {-0.0228500642267828,-20.2916494548402,10},
      {-0.0262320058025895,-22.2795870677593,10},
      {-0.0299452703138827,-24.3707842334848,10},
      {-0.0340070676861301,-26.5239371308942,10},
      {-0.0384277238746125,-28.6900930831015,10},
      {-0.0432094060551294,-30.8684872045304,10},
      {-0.0483541539225512,-33.057589724028,10},
      {-0.0538637522098892,-35.2551059848654,10},
      {-0.0597396032073667,-37.464095529348,10},
      {-0.0659836191289247,-39.6776743872886,10},
      {-0.0725965648601395,-41.9004318721454,10},
      {-0.0795799701721637,-44.1277786704603,10},
      {-0.0869345999505738,-46.3612445533859,10},
      {-0.0946614740428048,-48.6008295209222,10},
      {-0.102761612296292,-50.8450038019167,10},
      {-0.111235779596611,-53.0922376252165,10},
      {-0.120084485867481,-55.345590533127,10},
      {-0.129308750956335,-57.6004732121903,10},
      {-0.138908829825034,-59.8599452047116,10},
      {-0.148885487359152,-62.1224767395383,10},
      {-0.159239233482409,-64.3880678166703,10},
      {-0.16997057811852,-66.6567184361078,10},
      {-0.181080031191205,-68.9284285978506,10},
      {-0.19256810262418,-71.2016685307461,10},
      {-0.204435047379304,-73.4764382347943,10},
      {-0.216681120418437,-75.7557972523006,10},
      {-0.229307086627153,-78.0351562698069,10},
      {-0.242312946005455,-80.3160450584658,10},
      {-0.255698953515199,-82.6015231605828,10},
      {-0.269465874041963,-84.8870012626999,10},
      {-0.283613707585746,-87.1740091359696,10},
      {-0.298142709108408,-89.462546780392,10},
      {-0.313053133571806,-91.7526141959671,10},
      {-0.328345235937801,-94.0457411538475,10},
      {-0.344019526130109,-96.3373383405753,10},
      {-0.360075749186871,-98.6335248407611,10},
      {-0.376514669993665,-100.928181569794,10},
      {-0.393336033588631,-103.22436806998,10},
      {-0.410540094933627,-105.523614112471,10},
      {-0.428127363952372,-106.456774515612,10},
      {-0.445870159704974,-105.052444597443,10},
      {-0.463378900471215,-102.658352743485,10},
      {-0.480488625928462,-100.253552491459,10},
      {-0.497197551343706,-97.8472224682791,10},
      {-0.513505421755085,-95.439362673947,10},
      {-0.529411982200743,-93.0284433373095,10},
      {-0.544916722756961,-90.617524000672,10},
      {-0.56001964342374,-88.2050748928818,10},
      {-0.57472048923922,-85.7895662427862,10},
      {-0.589018750279685,-83.372527821538,10},
      {-0.602914171583274,-80.9524298579843,10},
      {-0.616406243226272,-78.5338616655834,10},
      {-0.629495220170536,-76.1091743885717,10},
      {-0.642180082568631,-73.6829573404073,10},
      {-0.654460575458699,-71.2552105210902,10},
      {-0.666336443878881,-68.8228743883151,10},
      {-0.6778069229436,-66.3905382555399,10},
      {-0.688872012652856,-63.9505532670014,10},
      {-0.699530438197357,-61.5105682784628,10},
      {-0.7097821995771,-59.0659939764661,10},
      {-0.719626531906511,-56.6168303610114,10},
      {-0.729062670300013,-54.1630774320986,10},
      {-0.73808984987203,-51.7032054185751,10},
      {-0.746707050775126,-49.2402738627461,10},
      {-0.754913763085583,-46.7681636800011,10},
      {-0.76270845703225,-44.291464183798,10},
      {-0.77009036772955,-41.8055860606787,10},
      {-0.77705796540633,-39.312059081796,10},
      {-0.783609975253296,-36.8078237048445,10},
      {-0.789744612537436,-34.2928799298242,10},
      {-0.79546009252574,-31.7626384432769,10},
      {-0.80075386559962,-29.2170992452028,10},
      {-0.805623382140487,-26.6501432509911,10},
      {-0.810065072682319,-24.0694193164051,10},
      {-0.814076642568386,-21.5514159990794,10},
      {-0.8176685452349,-19.1527348316634,10},
      {-0.820860667706844,-16.8794948987679,10},
      {-0.823673916856638,-14.7271068869348,10},
      {-0.826128434671127,-12.7016898807749,10},
      {-0.82824538298459,-10.8001843379827,10},
      {-0.830045413707587,-9.02717957201643,10},
      {-0.831549943636256,-7.37808626941794,10},
      {-0.832779624681159,-5.85902351479799,10},
      {-0.833756128600292,-4.46693176585121,10},
      {-0.834500617227934,-3.2018110225776,10},
      {-0.835034252398364,-2.06060174267177,10},
      {-0.835377686022142,-1.00658941846921,10},
   }; 
}; 