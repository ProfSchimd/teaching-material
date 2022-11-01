import 'dart:convert' as convert;
import 'package:http/http.dart' as http;

void main(List<String> arguments) async {
  final url = Uri.https('api.chucknorris.io', '/jokes/random');
  final response = await http.get(url);

  if (response.statusCode == 200) {
    print('Request Ok');
    final jsonResponse = convert.jsonDecode(response.body);
    final joke = jsonResponse['value'];
    print('Joke with Chuck Noris\n$joke.');
  } else {
  print('Request failed with status: ${response.statusCode}.');
  }
}
