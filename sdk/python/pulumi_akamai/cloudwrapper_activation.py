# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['CloudwrapperActivationArgs', 'CloudwrapperActivation']

@pulumi.input_type
class CloudwrapperActivationArgs:
    def __init__(__self__, *,
                 config_id: pulumi.Input[int],
                 revision: pulumi.Input[str],
                 timeouts: Optional[pulumi.Input['CloudwrapperActivationTimeoutsArgs']] = None):
        """
        The set of arguments for constructing a CloudwrapperActivation resource.
        :param pulumi.Input[int] config_id: The configuration you want to activate.
        :param pulumi.Input[str] revision: Unique hash value of the configuration.
        """
        pulumi.set(__self__, "config_id", config_id)
        pulumi.set(__self__, "revision", revision)
        if timeouts is not None:
            pulumi.set(__self__, "timeouts", timeouts)

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> pulumi.Input[int]:
        """
        The configuration you want to activate.
        """
        return pulumi.get(self, "config_id")

    @config_id.setter
    def config_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "config_id", value)

    @property
    @pulumi.getter
    def revision(self) -> pulumi.Input[str]:
        """
        Unique hash value of the configuration.
        """
        return pulumi.get(self, "revision")

    @revision.setter
    def revision(self, value: pulumi.Input[str]):
        pulumi.set(self, "revision", value)

    @property
    @pulumi.getter
    def timeouts(self) -> Optional[pulumi.Input['CloudwrapperActivationTimeoutsArgs']]:
        return pulumi.get(self, "timeouts")

    @timeouts.setter
    def timeouts(self, value: Optional[pulumi.Input['CloudwrapperActivationTimeoutsArgs']]):
        pulumi.set(self, "timeouts", value)


@pulumi.input_type
class _CloudwrapperActivationState:
    def __init__(__self__, *,
                 config_id: Optional[pulumi.Input[int]] = None,
                 revision: Optional[pulumi.Input[str]] = None,
                 timeouts: Optional[pulumi.Input['CloudwrapperActivationTimeoutsArgs']] = None):
        """
        Input properties used for looking up and filtering CloudwrapperActivation resources.
        :param pulumi.Input[int] config_id: The configuration you want to activate.
        :param pulumi.Input[str] revision: Unique hash value of the configuration.
        """
        if config_id is not None:
            pulumi.set(__self__, "config_id", config_id)
        if revision is not None:
            pulumi.set(__self__, "revision", revision)
        if timeouts is not None:
            pulumi.set(__self__, "timeouts", timeouts)

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> Optional[pulumi.Input[int]]:
        """
        The configuration you want to activate.
        """
        return pulumi.get(self, "config_id")

    @config_id.setter
    def config_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "config_id", value)

    @property
    @pulumi.getter
    def revision(self) -> Optional[pulumi.Input[str]]:
        """
        Unique hash value of the configuration.
        """
        return pulumi.get(self, "revision")

    @revision.setter
    def revision(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "revision", value)

    @property
    @pulumi.getter
    def timeouts(self) -> Optional[pulumi.Input['CloudwrapperActivationTimeoutsArgs']]:
        return pulumi.get(self, "timeouts")

    @timeouts.setter
    def timeouts(self, value: Optional[pulumi.Input['CloudwrapperActivationTimeoutsArgs']]):
        pulumi.set(self, "timeouts", value)


class CloudwrapperActivation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config_id: Optional[pulumi.Input[int]] = None,
                 revision: Optional[pulumi.Input[str]] = None,
                 timeouts: Optional[pulumi.Input[pulumi.InputType['CloudwrapperActivationTimeoutsArgs']]] = None,
                 __props__=None):
        """
        Create a CloudwrapperActivation resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] config_id: The configuration you want to activate.
        :param pulumi.Input[str] revision: Unique hash value of the configuration.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CloudwrapperActivationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a CloudwrapperActivation resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param CloudwrapperActivationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CloudwrapperActivationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config_id: Optional[pulumi.Input[int]] = None,
                 revision: Optional[pulumi.Input[str]] = None,
                 timeouts: Optional[pulumi.Input[pulumi.InputType['CloudwrapperActivationTimeoutsArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CloudwrapperActivationArgs.__new__(CloudwrapperActivationArgs)

            if config_id is None and not opts.urn:
                raise TypeError("Missing required property 'config_id'")
            __props__.__dict__["config_id"] = config_id
            if revision is None and not opts.urn:
                raise TypeError("Missing required property 'revision'")
            __props__.__dict__["revision"] = revision
            __props__.__dict__["timeouts"] = timeouts
        super(CloudwrapperActivation, __self__).__init__(
            'akamai:index/cloudwrapperActivation:CloudwrapperActivation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            config_id: Optional[pulumi.Input[int]] = None,
            revision: Optional[pulumi.Input[str]] = None,
            timeouts: Optional[pulumi.Input[pulumi.InputType['CloudwrapperActivationTimeoutsArgs']]] = None) -> 'CloudwrapperActivation':
        """
        Get an existing CloudwrapperActivation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] config_id: The configuration you want to activate.
        :param pulumi.Input[str] revision: Unique hash value of the configuration.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CloudwrapperActivationState.__new__(_CloudwrapperActivationState)

        __props__.__dict__["config_id"] = config_id
        __props__.__dict__["revision"] = revision
        __props__.__dict__["timeouts"] = timeouts
        return CloudwrapperActivation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> pulumi.Output[int]:
        """
        The configuration you want to activate.
        """
        return pulumi.get(self, "config_id")

    @property
    @pulumi.getter
    def revision(self) -> pulumi.Output[str]:
        """
        Unique hash value of the configuration.
        """
        return pulumi.get(self, "revision")

    @property
    @pulumi.getter
    def timeouts(self) -> pulumi.Output[Optional['outputs.CloudwrapperActivationTimeouts']]:
        return pulumi.get(self, "timeouts")
