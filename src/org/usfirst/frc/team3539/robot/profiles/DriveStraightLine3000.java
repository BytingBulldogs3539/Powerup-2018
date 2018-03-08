package org.usfirst.frc.team3539.robot.profiles;
public class DriveStraightLine3000 implements IProfile
{
  public static final int kNumPoints = 215;
  public static double PointsR[][] = new double[][] {
      {0,0.580703519828083,10},
      {9.67839199713472E-05,0.937534413259812,10},
      {0.000253039654269718,1.3634471426528,10},
      {0.000480280853426368,1.96467768156917,10},
      {0.000807727136177758,2.65334551757849,10},
      {0.00124995138412778,3.47106413094841,10},
      {0.00182846208257863,4.43686076747071,10},
      {0.00256793899169073,5.53367226409763,10},
      {0.00349021770237367,6.77696843161071,10},
      {0.00461971218202982,8.16745678916808,10},
      {0.00598095503998118,9.70730913375307,10},
      {0.00759883991552559,11.4003890936332,10},
      {0.00949890482422114,13.2483555144021,10},
      {0.0117069641562971,15.2534973161471,10},
      {0.014249213748826,17.4175440963776,10},
      {0.0171521387608338,19.742102114804,10},
      {0.0204424892726523,22.2286380395189,10},
      {0.0241472623589143,24.8784770347834,10},
      {0.0282936751980449,27.6927415701806,10},
      {0.0329091322060839,30.6726764969862,10},
      {0.0380212429636921,33.8190333152788,10},
      {0.0436577485162386,37.1325176320027,10},
      {0.0498465014549057,40.6180553102695,10},
      {0.0566161770212483,44.2066345489535,10},
      {0.0639839492867227,47.8173725227842,10},
      {0.0719535112145022,51.4468234222402,10},
      {0.0805279821035779,55.0955685603594,10},
      {0.0897105768636378,58.7598485245343,10},
      {0.0995038849510602,62.4386613146596,10},
      {0.109910328503503,66.1301406099293,10},
      {0.120932018923861,69.8332423415314,10},
      {0.132570892328747,73.5467618146834,10},
      {0.144828693613383,77.2696970292802,10},
      {0.157706976451597,81.0013825348704,10},
      {0.171207206874075,84.7410993390122,10},
      {0.185330723430577,88.4878913347351,10},
      {0.2000787053197,92.2414678655203,10},
      {0.215452283934691,96.001362351166,10},
      {0.231452510993219,99.7668940435094,10},
      {0.248080326667137,103.537971156281,10},
      {0.265336655193184,107.313828803905,10},
      {0.283222277392052,111.094658207776,10},
      {0.301738053760014,114.879694482316,10},
      {0.320884669507067,118.668746406132,10},
      {0.340662793908089,122.462005200618,10},
      {0.361073128108192,126.258514758803,10},
      {0.382116213901326,130.058665172332,10},
      {0.403792656821905,133.861859830454,10},
      {0.426102966793648,137.66869534392,10},
      {0.449047749350968,141.477641941577,10},
      {0.472627355066421,145.290015226616,10},
      {0.496842357604191,149.104882038634,10},
      {0.521693171277296,152.921859934842,10},
      {0.547180146658294,156.741499632856,10},
      {0.573303729930437,160.563250415061,10},
      {0.60006427166628,164.387295853994,10},
      {0.627462154308612,168.213635949657,10},
      {0.655497760300222,172.041888259261,10},
      {0.684171408343432,175.871670340017,10},
      {0.713483353400102,179.703364634714,10},
      {0.743433914172554,183.536971143352,10},
      {0.774023409363113,187.372489865931,10},
      {0.805252157674101,191.209538359663,10},
      {0.837120414067378,195.047351738971,10},
      {0.869628306023874,198.887459775008,10},
      {0.902776215986375,202.729097582198,10},
      {0.936564398916741,206.571117832175,10},
      {0.970992918555437,210.415432738882,10},
      {1.00606215734525,214.260894973954,10},
      {1.04177230650758,218.107886980178,10},
      {1.07812368474474,221.95526142919,10},
      {1.11511622831627,225.804165649355,10},
      {1.15275025592449,229.653834755096,10},
      {1.19102589505034,233.50503363199,10},
      {1.22994340065568,237.356997394461,10},
      {1.26950290022142,241.210490928084,10},
      {1.30970464870943,245.064749347283,10},
      {1.35054877360065,248.919772652059,10},
      {1.39203540237599,252.775560842411,10},
      {1.43416466251639,256.632878803915,10},
      {1.47693680898371,260.49019676542,10},
      {1.52035184177795,264.349044498078,10},
      {1.56441001586096,268.208657116311,10},
      {1.60911145871368,272.068269734545,10},
      {1.6544561703361,275.930177009508,10},
      {1.70044453317102,279.610806402877,10},
      {1.74704633423817,283.019136531068,10},
      {1.79421619032668,286.248483434394,10},
      {1.84192427089908,289.300376884008,10},
      {1.89014100037975,292.168697795299,10},
      {1.93883578334563,294.859565252879,10},
      {1.98797904422111,297.365330400983,10},
      {2.03753993262127,299.692112324223,10},
      {2.08748861800864,301.836086594716,10},
      {2.1377946324411,303.797253212463,10},
      {2.18842738049558,305.577906834193,10},
      {2.23935703163461,307.170398604142,10},
      {2.29055209806863,308.585436920379,10},
      {2.34198300422203,309.810783613682,10},
      {2.39361813482431,310.852557768663,10},
      {2.44542689445242,311.71534869878,10},
      {2.49737945256888,312.385388463658,10},
      {2.54944368397949,312.876445003671,10},
      {2.60158975814677,313.17780992075,10},
      {2.65378605980023,313.287953443744,10},
      {2.70600071870752,313.295602299507,10},
      {2.75821665242411,313.29713207066,10},
      {2.81043284110255,313.298661841813,10},
      {2.86264928474285,313.29713207066,10},
      {2.91486547342129,313.295602299507,10},
      {2.96708140713788,313.29713207066,10},
      {3.01929759581632,313.298661841813,10},
      {3.07151403945662,313.295602299507,10},
      {3.12372997317321,313.29713207066,10},
      {3.17594616185165,313.29713207066,10},
      {3.2281623505301,313.29713207066,10},
      {3.28037853920854,313.29713207066,10},
      {3.33259472788698,313.298661841813,10},
      {3.38481117152728,313.29713207066,10},
      {3.43702736020573,313.29713207066,10},
      {3.48924354888417,313.295602299507,10},
      {3.54145948260076,313.29713207066,10},
      {3.5936756712792,313.29713207066,10},
      {3.64589185995764,313.29713207066,10},
      {3.69810804863609,313.231351911095,10},
      {3.7503132739546,313.000356467039,10},
      {3.80248000003244,312.578139628896,10},
      {3.85457635663726,311.966231167821,10},
      {3.90657072849856,311.163101312659,10},
      {3.958431245384,310.177928690328,10},
      {4.01012756683239,308.998475131605,10},
      {4.06162731268766,307.632389492254,10},
      {4.11289937760303,306.081201543427,10},
      {4.16391291119361,304.335732658209,10},
      {4.21463553330331,302.400572150058,10},
      {4.26503562866165,300.278779561279,10},
      {4.31508209192186,297.962706036108,10},
      {4.36474254292788,295.456940888004,10},
      {4.41398536640922,292.761484116966,10},
      {4.46277894709538,289.870216638384,10},
      {4.51109064986844,286.789257536869,10},
      {4.55888885945792,283.51248772781,10},
      {4.60614094074589,280.049085838122,10},
      {4.65281578838557,276.30420605634,10},
      {4.69886648939496,272.342098770876,10},
      {4.74425683919011,268.364693773886,10},
      {4.78898428815242,264.3903483192,10},
      {4.83304934620562,260.416002864515,10},
      {4.87645201334971,256.438597867524,10},
      {4.91919177966096,252.461192870533,10},
      {4.96126864513939,248.483787873542,10},
      {5.00268260978498,244.503323334246,10},
      {5.04343316367402,240.52285879495,10},
      {5.08352030680651,236.542394255654,10},
      {5.12294403918245,232.558870174052,10},
      {5.16170385087813,228.575346092451,10},
      {5.19979974189354,224.591822010849,10},
      {5.23723171222868,220.605238386942,10},
      {5.27399925195983,216.61559522073,10},
      {5.31010185116329,212.629011596823,10},
      {5.34554001976276,208.636308888305,10},
      {5.38031273791081,204.646665722093,10},
      {5.41442051553116,200.65090347127,10},
      {5.44786233277637,196.658200762752,10},
      {5.48063869957016,192.659378969624,10},
      {5.5127485960651,188.663616718801,10},
      {5.5441925321849,184.661735383367,10},
      {5.57496948808213,180.659854047933,10},
      {5.60507946375678,176.654913170194,10},
      {5.63452194928515,172.649972292455,10},
      {5.66329694466723,168.64197187241,10},
      {5.69140393997929,164.63091191006,10},
      {5.71884242529764,160.61985194771,10},
      {5.74561240062225,156.602672900749,10},
      {5.77171284610571,152.585493853789,10},
      {5.79714376174801,148.565255264523,10},
      {5.82190463762543,144.541957132951,10},
      {5.84599496381426,140.512539916769,10},
      {5.86941372046705,136.483122700587,10},
      {5.89216090758382,132.450645942099,10},
      {5.91423601524083,128.412050099001,10},
      {5.93563802359067,124.370394713597,10},
      {5.9563664227096,120.325679785888,10},
      {5.97642070267391,116.274845773568,10},
      {5.99579984363618,112.220952218943,10},
      {6.01450333567267,108.160939579707,10},
      {6.03253015893595,104.09480785586,10},
      {6.04987929357859,100.019497505097,10},
      {6.06654920982944,95.9411276120289,10},
      {6.08253939776478,91.8566386343499,10},
      {6.09784883753717,87.7599114874494,10},
      {6.11247548945175,83.6570652559381,10},
      {6.12641833366107,79.5419808552053,10},
      {6.13967533047027,75.4177178275564,10},
      {6.1522449501082,71.2812166306859,10},
      {6.16412515287998,67.132477264594,10},
      {6.17531389909074,62.9653806446698,10},
      {6.18580812919819,58.7799267709133,10},
      {6.19560478366001,54.5730561010192,10},
      {6.20470029301018,50.3386495503767,10},
      {6.21309006793524,46.0797666612911,10},
      {6.22077002904546,41.7780501799303,10},
      {6.22773303740878,37.5191672908448,10},
      {6.23398623195725,33.4438569400819,10},
      {6.23956020811393,29.5735359237793,10},
      {6.2444891307679,25.908204241937,10},
      {6.24880716480822,22.4509214368604,10},
      {6.2525489850477,19.2047470508548,10},
      {6.25574977622284,16.1635619993095,10},
      {6.25844370322272,13.3365449091407,10},
      {6.26066646070758,10.7206362380429,10},
      {6.26245323341392,8.31583598601615,10},
      {6.26383920607826,6.12826323767121,10},
      {6.26486058328453,4.13650119687043,10},
      {6.26555000015068,2.31913306747618,10},
  }; 
  public static double PointsL[][] = new double[][] {
      {0,0.580703519828083,10},
      {9.67839199713472E-05,0.937534413259812,10},
      {0.000253039654269718,1.3634471426528,10},
      {0.000480280853426368,1.96467768156917,10},
      {0.000807727136177758,2.65334551757849,10},
      {0.00124995138412778,3.47106413094841,10},
      {0.00182846208257863,4.43686076747071,10},
      {0.00256793899169073,5.53367226409763,10},
      {0.00349021770237367,6.77696843161071,10},
      {0.00461971218202982,8.16745678916808,10},
      {0.00598095503998118,9.70730913375307,10},
      {0.00759883991552559,11.4003890936332,10},
      {0.00949890482422114,13.2483555144021,10},
      {0.0117069641562971,15.2534973161471,10},
      {0.014249213748826,17.4175440963776,10},
      {0.0171521387608338,19.742102114804,10},
      {0.0204424892726523,22.2286380395189,10},
      {0.0241472623589143,24.8784770347834,10},
      {0.0282936751980449,27.6927415701806,10},
      {0.0329091322060839,30.6726764969862,10},
      {0.0380212429636921,33.8190333152788,10},
      {0.0436577485162386,37.1325176320027,10},
      {0.0498465014549057,40.6180553102695,10},
      {0.0566161770212483,44.2066345489535,10},
      {0.0639839492867227,47.8173725227842,10},
      {0.0719535112145022,51.4468234222402,10},
      {0.0805279821035779,55.0955685603594,10},
      {0.0897105768636378,58.7598485245343,10},
      {0.0995038849510602,62.4386613146596,10},
      {0.109910328503503,66.1301406099293,10},
      {0.120932018923861,69.8332423415314,10},
      {0.132570892328747,73.5467618146834,10},
      {0.144828693613383,77.2696970292802,10},
      {0.157706976451597,81.0013825348704,10},
      {0.171207206874075,84.7410993390122,10},
      {0.185330723430577,88.4878913347351,10},
      {0.2000787053197,92.2414678655203,10},
      {0.215452283934691,96.001362351166,10},
      {0.231452510993219,99.7668940435094,10},
      {0.248080326667137,103.537971156281,10},
      {0.265336655193184,107.313828803905,10},
      {0.283222277392052,111.094658207776,10},
      {0.301738053760014,114.879694482316,10},
      {0.320884669507067,118.668746406132,10},
      {0.340662793908089,122.462005200618,10},
      {0.361073128108192,126.258514758803,10},
      {0.382116213901326,130.058665172332,10},
      {0.403792656821905,133.861859830454,10},
      {0.426102966793648,137.66869534392,10},
      {0.449047749350968,141.477641941577,10},
      {0.472627355066421,145.290015226616,10},
      {0.496842357604191,149.104882038634,10},
      {0.521693171277296,152.921859934842,10},
      {0.547180146658294,156.741499632856,10},
      {0.573303729930437,160.563250415061,10},
      {0.60006427166628,164.387295853994,10},
      {0.627462154308612,168.213635949657,10},
      {0.655497760300222,172.041888259261,10},
      {0.684171408343432,175.871670340017,10},
      {0.713483353400102,179.703364634714,10},
      {0.743433914172554,183.536971143352,10},
      {0.774023409363113,187.372489865931,10},
      {0.805252157674101,191.209538359663,10},
      {0.837120414067378,195.047351738971,10},
      {0.869628306023874,198.887459775008,10},
      {0.902776215986375,202.729097582198,10},
      {0.936564398916741,206.571117832175,10},
      {0.970992918555437,210.415432738882,10},
      {1.00606215734525,214.260894973954,10},
      {1.04177230650758,218.107886980178,10},
      {1.07812368474474,221.95526142919,10},
      {1.11511622831627,225.804165649355,10},
      {1.15275025592449,229.653834755096,10},
      {1.19102589505034,233.50503363199,10},
      {1.22994340065568,237.356997394461,10},
      {1.26950290022142,241.210490928084,10},
      {1.30970464870943,245.064749347283,10},
      {1.35054877360065,248.919772652059,10},
      {1.39203540237599,252.775560842411,10},
      {1.43416466251639,256.632878803915,10},
      {1.47693680898371,260.49019676542,10},
      {1.52035184177795,264.349044498078,10},
      {1.56441001586096,268.208657116311,10},
      {1.60911145871368,272.068269734545,10},
      {1.6544561703361,275.930177009508,10},
      {1.70044453317102,279.610806402877,10},
      {1.74704633423817,283.019136531068,10},
      {1.79421619032668,286.248483434394,10},
      {1.84192427089908,289.300376884008,10},
      {1.89014100037975,292.168697795299,10},
      {1.93883578334563,294.859565252879,10},
      {1.98797904422111,297.365330400983,10},
      {2.03753993262127,299.692112324223,10},
      {2.08748861800864,301.836086594716,10},
      {2.1377946324411,303.797253212463,10},
      {2.18842738049558,305.577906834193,10},
      {2.23935703163461,307.170398604142,10},
      {2.29055209806863,308.585436920379,10},
      {2.34198300422203,309.810783613682,10},
      {2.39361813482431,310.852557768663,10},
      {2.44542689445242,311.71534869878,10},
      {2.49737945256888,312.385388463658,10},
      {2.54944368397949,312.876445003671,10},
      {2.60158975814677,313.17780992075,10},
      {2.65378605980023,313.287953443744,10},
      {2.70600071870752,313.295602299507,10},
      {2.75821665242411,313.29713207066,10},
      {2.81043284110255,313.298661841813,10},
      {2.86264928474285,313.29713207066,10},
      {2.91486547342129,313.295602299507,10},
      {2.96708140713788,313.29713207066,10},
      {3.01929759581632,313.298661841813,10},
      {3.07151403945662,313.295602299507,10},
      {3.12372997317321,313.29713207066,10},
      {3.17594616185165,313.29713207066,10},
      {3.2281623505301,313.29713207066,10},
      {3.28037853920854,313.29713207066,10},
      {3.33259472788698,313.298661841813,10},
      {3.38481117152728,313.29713207066,10},
      {3.43702736020573,313.29713207066,10},
      {3.48924354888417,313.295602299507,10},
      {3.54145948260076,313.29713207066,10},
      {3.5936756712792,313.29713207066,10},
      {3.64589185995764,313.29713207066,10},
      {3.69810804863609,313.231351911095,10},
      {3.7503132739546,313.000356467039,10},
      {3.80248000003244,312.578139628896,10},
      {3.85457635663726,311.966231167821,10},
      {3.90657072849856,311.163101312659,10},
      {3.958431245384,310.177928690328,10},
      {4.01012756683239,308.998475131605,10},
      {4.06162731268766,307.632389492254,10},
      {4.11289937760303,306.081201543427,10},
      {4.16391291119361,304.335732658209,10},
      {4.21463553330331,302.400572150058,10},
      {4.26503562866165,300.278779561279,10},
      {4.31508209192186,297.962706036108,10},
      {4.36474254292788,295.456940888004,10},
      {4.41398536640922,292.761484116966,10},
      {4.46277894709538,289.870216638384,10},
      {4.51109064986844,286.789257536869,10},
      {4.55888885945792,283.51248772781,10},
      {4.60614094074589,280.049085838122,10},
      {4.65281578838557,276.30420605634,10},
      {4.69886648939496,272.342098770876,10},
      {4.74425683919011,268.364693773886,10},
      {4.78898428815242,264.3903483192,10},
      {4.83304934620562,260.416002864515,10},
      {4.87645201334971,256.438597867524,10},
      {4.91919177966096,252.461192870533,10},
      {4.96126864513939,248.483787873542,10},
      {5.00268260978498,244.503323334246,10},
      {5.04343316367402,240.52285879495,10},
      {5.08352030680651,236.542394255654,10},
      {5.12294403918245,232.558870174052,10},
      {5.16170385087813,228.575346092451,10},
      {5.19979974189354,224.591822010849,10},
      {5.23723171222868,220.605238386942,10},
      {5.27399925195983,216.61559522073,10},
      {5.31010185116329,212.629011596823,10},
      {5.34554001976276,208.636308888305,10},
      {5.38031273791081,204.646665722093,10},
      {5.41442051553116,200.65090347127,10},
      {5.44786233277637,196.658200762752,10},
      {5.48063869957016,192.659378969624,10},
      {5.5127485960651,188.663616718801,10},
      {5.5441925321849,184.661735383367,10},
      {5.57496948808213,180.659854047933,10},
      {5.60507946375678,176.654913170194,10},
      {5.63452194928515,172.649972292455,10},
      {5.66329694466723,168.64197187241,10},
      {5.69140393997929,164.63091191006,10},
      {5.71884242529764,160.61985194771,10},
      {5.74561240062225,156.602672900749,10},
      {5.77171284610571,152.585493853789,10},
      {5.79714376174801,148.565255264523,10},
      {5.82190463762543,144.541957132951,10},
      {5.84599496381426,140.512539916769,10},
      {5.86941372046705,136.483122700587,10},
      {5.89216090758382,132.450645942099,10},
      {5.91423601524083,128.412050099001,10},
      {5.93563802359067,124.370394713597,10},
      {5.9563664227096,120.325679785888,10},
      {5.97642070267391,116.274845773568,10},
      {5.99579984363618,112.220952218943,10},
      {6.01450333567267,108.160939579707,10},
      {6.03253015893595,104.09480785586,10},
      {6.04987929357859,100.019497505097,10},
      {6.06654920982944,95.9411276120289,10},
      {6.08253939776478,91.8566386343499,10},
      {6.09784883753717,87.7599114874494,10},
      {6.11247548945175,83.6570652559381,10},
      {6.12641833366107,79.5419808552053,10},
      {6.13967533047027,75.4177178275564,10},
      {6.1522449501082,71.2812166306859,10},
      {6.16412515287998,67.132477264594,10},
      {6.17531389909074,62.9653806446698,10},
      {6.18580812919819,58.7799267709133,10},
      {6.19560478366001,54.5730561010192,10},
      {6.20470029301018,50.3386495503767,10},
      {6.21309006793524,46.0797666612911,10},
      {6.22077002904546,41.7780501799303,10},
      {6.22773303740878,37.5191672908448,10},
      {6.23398623195725,33.4438569400819,10},
      {6.23956020811393,29.5735359237793,10},
      {6.2444891307679,25.908204241937,10},
      {6.24880716480822,22.4509214368604,10},
      {6.2525489850477,19.2047470508548,10},
      {6.25574977622284,16.1635619993095,10},
      {6.25844370322272,13.3365449091407,10},
      {6.26066646070758,10.7206362380429,10},
      {6.26245323341392,8.31583598601615,10},
      {6.26383920607826,6.12826323767121,10},
      {6.26486058328453,4.13650119687043,10},
      {6.26555000015068,2.31913306747618,10},
   }; 
}; 
