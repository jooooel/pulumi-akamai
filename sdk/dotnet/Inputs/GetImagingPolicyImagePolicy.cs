// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyArgs : global::Pulumi.InvokeArgs
    {
        [Input("breakpoints")]
        public Inputs.GetImagingPolicyImagePolicyBreakpointsArgs? Breakpoints { get; set; }

        [Input("hosts")]
        private List<string>? _hosts;
        public List<string> Hosts
        {
            get => _hosts ?? (_hosts = new List<string>());
            set => _hosts = value;
        }

        [Input("output")]
        public Inputs.GetImagingPolicyImagePolicyOutputArgs? Output { get; set; }

        [Input("postBreakpointTransformations")]
        private List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationArgs>? _postBreakpointTransformations;
        public List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationArgs> PostBreakpointTransformations
        {
            get => _postBreakpointTransformations ?? (_postBreakpointTransformations = new List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationArgs>());
            set => _postBreakpointTransformations = value;
        }

        [Input("rolloutDuration")]
        public string? RolloutDuration { get; set; }

        [Input("transformations")]
        private List<Inputs.GetImagingPolicyImagePolicyTransformationArgs>? _transformations;
        public List<Inputs.GetImagingPolicyImagePolicyTransformationArgs> Transformations
        {
            get => _transformations ?? (_transformations = new List<Inputs.GetImagingPolicyImagePolicyTransformationArgs>());
            set => _transformations = value;
        }

        [Input("variables")]
        private List<Inputs.GetImagingPolicyImagePolicyVariableArgs>? _variables;
        public List<Inputs.GetImagingPolicyImagePolicyVariableArgs> Variables
        {
            get => _variables ?? (_variables = new List<Inputs.GetImagingPolicyImagePolicyVariableArgs>());
            set => _variables = value;
        }

        public GetImagingPolicyImagePolicyArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyArgs Empty => new GetImagingPolicyImagePolicyArgs();
    }
}