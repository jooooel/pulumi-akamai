# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetBotmanCustomClientResult',
    'AwaitableGetBotmanCustomClientResult',
    'get_botman_custom_client',
    'get_botman_custom_client_output',
]

@pulumi.output_type
class GetBotmanCustomClientResult:
    """
    A collection of values returned by getBotmanCustomClient.
    """
    def __init__(__self__, config_id=None, custom_client_id=None, id=None, json=None):
        if config_id and not isinstance(config_id, int):
            raise TypeError("Expected argument 'config_id' to be a int")
        pulumi.set(__self__, "config_id", config_id)
        if custom_client_id and not isinstance(custom_client_id, str):
            raise TypeError("Expected argument 'custom_client_id' to be a str")
        pulumi.set(__self__, "custom_client_id", custom_client_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if json and not isinstance(json, str):
            raise TypeError("Expected argument 'json' to be a str")
        pulumi.set(__self__, "json", json)

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> int:
        return pulumi.get(self, "config_id")

    @property
    @pulumi.getter(name="customClientId")
    def custom_client_id(self) -> Optional[str]:
        return pulumi.get(self, "custom_client_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def json(self) -> str:
        return pulumi.get(self, "json")


class AwaitableGetBotmanCustomClientResult(GetBotmanCustomClientResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetBotmanCustomClientResult(
            config_id=self.config_id,
            custom_client_id=self.custom_client_id,
            id=self.id,
            json=self.json)


def get_botman_custom_client(config_id: Optional[int] = None,
                             custom_client_id: Optional[str] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetBotmanCustomClientResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['configId'] = config_id
    __args__['customClientId'] = custom_client_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('akamai:index/getBotmanCustomClient:getBotmanCustomClient', __args__, opts=opts, typ=GetBotmanCustomClientResult).value

    return AwaitableGetBotmanCustomClientResult(
        config_id=pulumi.get(__ret__, 'config_id'),
        custom_client_id=pulumi.get(__ret__, 'custom_client_id'),
        id=pulumi.get(__ret__, 'id'),
        json=pulumi.get(__ret__, 'json'))


@_utilities.lift_output_func(get_botman_custom_client)
def get_botman_custom_client_output(config_id: Optional[pulumi.Input[int]] = None,
                                    custom_client_id: Optional[pulumi.Input[Optional[str]]] = None,
                                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetBotmanCustomClientResult]:
    """
    Use this data source to access information about an existing resource.
    """
    ...