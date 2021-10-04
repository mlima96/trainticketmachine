# TrainTicketMachine

> An api that will return a list of stations' names and suggestions of valid next characters, based on a search string.

## ☕ Usage

To run **trainticketmachine**, execute:

```
./gradlew :web-api:bootRun
```

## Request example

GET - http://localhost:8080/api/stations?searchTerm=Santa
```
{
    "stations": [
        {
            "name": "Santa Augusta"
        },
        {
            "name": "Santa Iria"
        },
        {
            "name": "Santa Margarida"
        },
        {
            "name": "Santana-Cartaxo"
        },
        {
            "name": "Santarém"
        }
    ],
    "validCharacters": [
        " ",
        "n",
        "r"
    ]
}
```
