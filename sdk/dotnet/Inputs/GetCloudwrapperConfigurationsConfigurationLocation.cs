// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetCloudwrapperConfigurationsConfigurationLocationArgs : global::Pulumi.InvokeArgs
    {
        [Input("capacity", required: true)]
        public Inputs.GetCloudwrapperConfigurationsConfigurationLocationCapacityArgs Capacity { get; set; } = null!;

        [Input("comments", required: true)]
        public string Comments { get; set; } = null!;

        [Input("mapName", required: true)]
        public string MapName { get; set; } = null!;

        [Input("trafficTypeId", required: true)]
        public int TrafficTypeId { get; set; }

        public GetCloudwrapperConfigurationsConfigurationLocationArgs()
        {
        }
        public static new GetCloudwrapperConfigurationsConfigurationLocationArgs Empty => new GetCloudwrapperConfigurationsConfigurationLocationArgs();
    }
}