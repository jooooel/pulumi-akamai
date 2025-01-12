// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetCloudwrapperConfigurationsConfigurationLocationInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("capacity", required: true)]
        public Input<Inputs.GetCloudwrapperConfigurationsConfigurationLocationCapacityInputArgs> Capacity { get; set; } = null!;

        [Input("comments", required: true)]
        public Input<string> Comments { get; set; } = null!;

        [Input("mapName", required: true)]
        public Input<string> MapName { get; set; } = null!;

        [Input("trafficTypeId", required: true)]
        public Input<int> TrafficTypeId { get; set; } = null!;

        public GetCloudwrapperConfigurationsConfigurationLocationInputArgs()
        {
        }
        public static new GetCloudwrapperConfigurationsConfigurationLocationInputArgs Empty => new GetCloudwrapperConfigurationsConfigurationLocationInputArgs();
    }
}
