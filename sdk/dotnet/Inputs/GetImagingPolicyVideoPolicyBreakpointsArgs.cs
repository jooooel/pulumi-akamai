// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyVideoPolicyBreakpointsInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("widths")]
        private InputList<int>? _widths;
        public InputList<int> Widths
        {
            get => _widths ?? (_widths = new InputList<int>());
            set => _widths = value;
        }

        public GetImagingPolicyVideoPolicyBreakpointsInputArgs()
        {
        }
        public static new GetImagingPolicyVideoPolicyBreakpointsInputArgs Empty => new GetImagingPolicyVideoPolicyBreakpointsInputArgs();
    }
}