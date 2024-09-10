# Open-Closed Principle (OCP) Uygulama Örneği

Bu proje, S.O.L.I.D prensiplerinden ikincisi olan Open-Closed Principle (OCP)'yi göstermek için hazırlanmıştır. Proje, OCP'yi ihlal eden bir yapıyı ve bu ilkeye uygun olarak yeniden yapılandırılmış bir yapıyı içermektedir.

## Proje Yapısı

Proje, iki ana klasör altında organize edilmiştir:

- **bad**: OCP'nin ihlal edildiği bir yapıyı temsil eder.
- **good**: OCP prensibine uygun olarak yeniden yapılandırılmış yapıyı temsil eder.

### Klasör ve Dosya Yapısı
![image](https://github.com/user-attachments/assets/37e60b2f-3ece-49a3-a9d3-1a956dd266b1)

### Klasörlerin Açıklamaları

- **bad**: Bu klasörde, `NotificationService.java` sınıfı her yeni bildirim türünde değişmelidir. Bu yapı, OCP'yi ihlal eden bir örnek teşkil eder.
  
- **good**: Bu klasörde, OCP'ye uygun olarak yeniden yapılandırılmış bir yapıyı bulabilirsiniz. Her yeni bildirim `notification/types` alt klasöründe yeni bir sınıf olarak tanımlanır.

## Nasıl Çalıştırılır

### OCP İhlali Örneği (bad)

OCP'nin ihlal edildiği yapıyı çalıştırmak için `bad/Application.java` dosyasını çalıştırın.

### OCP'ye Uygun Örnek (good)

OCP prensibine uygun yapıyı görmek için `good/Application.java` dosyasını çalıştırın.

## Neden OCP?

**Open-Closed Principle**, yazılım geliştirmenin temel prensiplerinden biridir. Kodun genişletilebilirliğini ve sürdürülebilirliğini artırarak yazılımın bakımını kolaylaştırır. Yeni özellikler eklerken mevcut işlevlerin bozulma riskini en aza indirir ve uzun vadede daha az hata ile karşılaşmamızı sağlar. OCP'ye uygun yapılar, daha esnek ve dayanıklı yazılımlar geliştirmemize yardımcı olur.
