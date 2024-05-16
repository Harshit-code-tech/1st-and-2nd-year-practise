import json

# Load intents and responses from JSON file
with open('intents.json', 'r') as file:
    intents_data = json.load(file)

intents = intents_data['intents']

def generate_response(user_query):
    # Process user query and generate chatbot response
    for intent in intents:
        for pattern in intent['patterns']:
            if user_query.lower() in pattern.lower():
                response = intent['responses']
                return response
    return "Sorry, I didn't understand that. Can you please try again?"
