
Добрый день!
Проблемы реализации:
1. Все методы нужно объявлять с модификатором доступа public. Методы будут открытыми для всех, что повлечет за собой проблемы с безопастностью программы.
2. Методы нужно переопределять, в конкретном наследнике по выполняемым действиям для кажого наследника родительского класса Animal, что повлечет за собой увелечение объемов работы и ошибки человеческого характера, а также проблемы с оптимизацией.
