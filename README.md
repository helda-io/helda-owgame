curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' --header 'kekkonen.mode: invoke' -d '{
  "action": "fight",
  "source-entity-id": "5c51ec5f4d22df75677eff07",
  "target-entity-id": "5c51ec5f4d22df75677eff05",
  "action-ctx": {}
}' 'http://localhost:3000/entities/perform-action'
