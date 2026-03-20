# AuraDocs 🚀
### AI-Driven API Documentation & Mocking Engine

AuraDocs is a modern developer tool that synchronizes Spring Boot controllers with interactive documentation and provides **context-aware** mock data using local Large Language Models (LLMs).

## ✨ Key Features
- **AI-Powered Mocking:** Uses **Ollama (Llama 3)** to generate realistic, context-specific mock data (e.g., generating Sri Lankan names or valid NICs based on field intent).
- **Spring Boot 4 + Java 21:** Leverages the latest industry standards and Virtual Threads for high-performance request handling.
- **Privacy First:** All AI inference happens locally on your machine—no data ever leaves your network.
- **Zero-Drift Sync:** Automatically extracts API schemas to ensure documentation matches the code implementation.

## 🛠️ Tech Stack
- **Backend:** Spring Boot 4.0.4, Spring AI
- **Runtime:** Java 21 (LTS)
- **Database:** MongoDB
- **AI Engine:** Ollama (Local)
- **Architecture:** Hexagonal/Layered Architecture

## 🚀 Getting Started (Local Development)
1. Ensure **Ollama** is running on your Mac: `ollama run llama3`
2. Clone this repo: `git clone https://github.com/yourusername/auradocs-ai-mock-engine.git`
3. Update `application.properties` with your MongoDB URI.
4. Run: `./mvnw spring-boot:run`

---
Developed by **Ranindu Amarasinghe**
