# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['BotmanCustomClientArgs', 'BotmanCustomClient']

@pulumi.input_type
class BotmanCustomClientArgs:
    def __init__(__self__, *,
                 config_id: pulumi.Input[int],
                 custom_client: pulumi.Input[str]):
        """
        The set of arguments for constructing a BotmanCustomClient resource.
        """
        pulumi.set(__self__, "config_id", config_id)
        pulumi.set(__self__, "custom_client", custom_client)

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> pulumi.Input[int]:
        return pulumi.get(self, "config_id")

    @config_id.setter
    def config_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "config_id", value)

    @property
    @pulumi.getter(name="customClient")
    def custom_client(self) -> pulumi.Input[str]:
        return pulumi.get(self, "custom_client")

    @custom_client.setter
    def custom_client(self, value: pulumi.Input[str]):
        pulumi.set(self, "custom_client", value)


@pulumi.input_type
class _BotmanCustomClientState:
    def __init__(__self__, *,
                 config_id: Optional[pulumi.Input[int]] = None,
                 custom_client: Optional[pulumi.Input[str]] = None,
                 custom_client_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering BotmanCustomClient resources.
        """
        if config_id is not None:
            pulumi.set(__self__, "config_id", config_id)
        if custom_client is not None:
            pulumi.set(__self__, "custom_client", custom_client)
        if custom_client_id is not None:
            pulumi.set(__self__, "custom_client_id", custom_client_id)

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "config_id")

    @config_id.setter
    def config_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "config_id", value)

    @property
    @pulumi.getter(name="customClient")
    def custom_client(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "custom_client")

    @custom_client.setter
    def custom_client(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "custom_client", value)

    @property
    @pulumi.getter(name="customClientId")
    def custom_client_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "custom_client_id")

    @custom_client_id.setter
    def custom_client_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "custom_client_id", value)


class BotmanCustomClient(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config_id: Optional[pulumi.Input[int]] = None,
                 custom_client: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a BotmanCustomClient resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BotmanCustomClientArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a BotmanCustomClient resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param BotmanCustomClientArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BotmanCustomClientArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config_id: Optional[pulumi.Input[int]] = None,
                 custom_client: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BotmanCustomClientArgs.__new__(BotmanCustomClientArgs)

            if config_id is None and not opts.urn:
                raise TypeError("Missing required property 'config_id'")
            __props__.__dict__["config_id"] = config_id
            if custom_client is None and not opts.urn:
                raise TypeError("Missing required property 'custom_client'")
            __props__.__dict__["custom_client"] = custom_client
            __props__.__dict__["custom_client_id"] = None
        super(BotmanCustomClient, __self__).__init__(
            'akamai:index/botmanCustomClient:BotmanCustomClient',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            config_id: Optional[pulumi.Input[int]] = None,
            custom_client: Optional[pulumi.Input[str]] = None,
            custom_client_id: Optional[pulumi.Input[str]] = None) -> 'BotmanCustomClient':
        """
        Get an existing BotmanCustomClient resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BotmanCustomClientState.__new__(_BotmanCustomClientState)

        __props__.__dict__["config_id"] = config_id
        __props__.__dict__["custom_client"] = custom_client
        __props__.__dict__["custom_client_id"] = custom_client_id
        return BotmanCustomClient(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> pulumi.Output[int]:
        return pulumi.get(self, "config_id")

    @property
    @pulumi.getter(name="customClient")
    def custom_client(self) -> pulumi.Output[str]:
        return pulumi.get(self, "custom_client")

    @property
    @pulumi.getter(name="customClientId")
    def custom_client_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "custom_client_id")
