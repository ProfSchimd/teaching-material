import 'package:flutter/material.dart';
import 'package:wave/config.dart';
import 'package:wave/wave.dart';

void main() => runApp(const AppMarea());

class AppMarea extends StatelessWidget {
  final String appTitle = 'CZ Marea Venezia';
  const AppMarea({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: appTitle,
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: const SensorListPage(),
    );
  }
}

class SensorListPage extends StatefulWidget {
  const SensorListPage({super.key});
  @override
  _SensorListState createState() => _SensorListState();
}

class _SensorListState extends State<SensorListPage> {
  final _sensors = [
    'Punta Salute Canal Grande',
    'Burano',
    'Chioggia porto',
    'Chioggia Vigo',
    'Diga nord Malamocco',
    'Diga sud Chioggia',
    'Diga sud Lido',
    'Fusina',
    'Laguna nord Saline',
    'Malamocco Porto',
    'Piattaforma Acqua Alta',
    'Venezia Misericordia',
  ];

  void _tapped(BuildContext context, int index) {
    Navigator.of(context).push(MaterialPageRoute(
        builder: (context) => DetailPage(station: _sensors[index])));
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('Marea a Venezia')),
      body: ListView.builder(
        itemCount: _sensors.length,
        itemBuilder: (context, index) {
          return ListTile(
            title: Text(
              _sensors[index],
              textAlign: TextAlign.center,
            ),
            onTap: () => _tapped(context, index),
          );
        },
      ),
    );
  }
}

class DetailPage extends StatelessWidget {
  final String station;
  final String data = "2022-11-12 17:30:00";
  final String valore = "0.8 m";
  const DetailPage({super.key, required this.station});
  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: Text(station),
        ),
        body: Center(
          child: Stack(
            children: [
              Container(
                decoration: BoxDecoration(
                  image: DecorationImage(
                      image: const AssetImage("assets/smc.jpeg"),
                      fit: BoxFit.cover,
                      colorFilter: ColorFilter.mode(
                          Colors.black.withOpacity(0.3), BlendMode.dstATop)),
                ),
                alignment: Alignment.bottomCenter,
                child: WaveWidget(
                  config: CustomConfig(colors: [
                    Colors.blue.withAlpha(75),
                    Colors.blue.withAlpha(75),
                    Colors.blue.withAlpha(75),
                  ], durations: [
                    8000,
                    5000,
                    12000
                  ], heightPercentages: [
                    0.01,
                    0.02,
                    0.03
                  ], blur: const MaskFilter.blur(BlurStyle.solid, 3)),
                  waveAmplitude: 20,
                  size: const Size(double.infinity, 1 * 300),
                  // waveAmplitude: 0,
                ),
              ),
              Center(
                  child: Column(
                      mainAxisAlignment: MainAxisAlignment.center,
                      children: [
                    Text(station,
                        style: Theme.of(context).textTheme.headlineMedium),
                    Text(data,
                        style: Theme.of(context).textTheme.headlineSmall),
                    Text(valore,
                        style: Theme.of(context).textTheme.displayMedium),
                  ])),
            ],
          ),
        ));
  }
}
