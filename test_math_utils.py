import pytest
from math_utils import MathUtils

@pytest.fixture
def math_utils():
    return MathUtils()

def test_add(math_utils):
    assert math_utils.add(2, 3) == 5
    assert math_utils.add(-3, 2) == -1
    assert math_utils.add(0, 0) == 0

def test_subtract(math_utils):
    assert math_utils.subtract(3, 2) == 1
    assert math_utils.subtract(-3, 2) == -5
    assert math_utils.subtract(3, 3) == 0

def test_multiply(math_utils):
    assert math_utils.multiply(2, 3) == 6
    assert math_utils.multiply(-2, 3) == -6
    assert math_utils.multiply(0, 5) == 0

def test_divide(math_utils):
    assert math_utils.divide(6, 3) == 2.0
    assert math_utils.divide(-6, 3) == -2.0
    assert math_utils.divide(6, 0) == -1.0
    assert math_utils.divide(0, 5) == 0.0
